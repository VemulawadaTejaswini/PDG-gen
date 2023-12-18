import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0595().doIt();
	}

	class AOJ0595{
		//責任者は絶対にこなきゃだめ
		int n;
		int[][] dp;

		void print(){
			for(int i=0;i<=n;i++){
				for(int s=0;s<7;s++)System.out.print(dp[i][s]+" ");
				System.out.println();
			}
			System.out.println("*******");
		}

		void doIt(){
			n = in.nextInt();
			String sekinin = in.next();
			char[] seki = sekinin.toCharArray();
			dp = new int[n+1][7];//joi,jo,oi,ji,j,o,i,
			HashMap<Character,ArrayList<Integer>> from = new HashMap<Character, ArrayList<Integer>>();
			dp[0][0]=1;dp[0][1]=1;dp[0][3]=1;dp[0][4]=1;
			from.put('J',new ArrayList<Integer>());
			from.put('O',new ArrayList<Integer>());
			from.put('I',new ArrayList<Integer>());
			from.get('J').add(0);from.get('J').add(1);from.get('J').add(3);from.get('J').add(4);
			from.get('O').add(0);from.get('O').add(1);from.get('O').add(2);from.get('O').add(5);
			from.get('I').add(0);from.get('I').add(2);from.get('I').add(3);from.get('I').add(6);
			HashMap<Integer,ArrayList<Integer>> go = new HashMap<Integer, ArrayList<Integer>>();
			go.put(0, new ArrayList<Integer>());go.put(1, new ArrayList<Integer>());go.put(2, new ArrayList<Integer>());
			go.put(3, new ArrayList<Integer>());go.put(4, new ArrayList<Integer>());go.put(5, new ArrayList<Integer>());
			go.put(6, new ArrayList<Integer>());
			for(int i=0;i<7;i++)go.get(0).add(i);
			for(int i=0;i<6;i++)go.get(1).add(i);
			for(int i=0;i<7;i++)if(i!=4)go.get(2).add(i);
			for(int i=0;i<7;i++)if(i!=5)go.get(3).add(i);
			go.get(4).add(0);go.get(4).add(1);go.get(4).add(3);go.get(4).add(4);
			go.get(5).add(0);go.get(5).add(1);go.get(5).add(2);go.get(5).add(5);
			go.get(6).add(0);go.get(6).add(2);go.get(6).add(3);go.get(6).add(6);

			//			for(int i=0;i<7;i++)System.out.println(go.get(i));
			for(int i=0;i<n;i++){
				ArrayList<Integer> list = from.get(seki[i]);//責任者
				for(int s=0;s<list.size();s++)if(dp[i][list.get(s)]>0){//責任者のいる所の中で
					for(int k=0;k<go.get(list.get(s)).size();k++){
						dp[i+1][go.get(list.get(s)).get(k)]+=dp[i][list.get(s)];
						dp[i+1][go.get(list.get(s)).get(k)] = dp[i+1][go.get(list.get(s)).get(k)]%10007; 
					}
				}
			}	
//			print();
			int result = 0;
//			System.out.println(seki[n-1]);
//			System.out.println(from.get(seki[n-1]));
			for(int s=0;s<from.get(seki[n-1]).size();s++){
				result += (dp[n-1][from.get(seki[n-1]).get(s)]);
			}
			System.out.println(result%10007);
		}
	}
}