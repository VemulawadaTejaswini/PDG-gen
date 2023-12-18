import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new A().doIt();
	}
	
	class A{
		int n,m;
		int[] result;
		int zero,one;
		boolean calc(int target){
			int index = 0,num = 1;
			int c = ((target>>0)%2);
			for(int i=1;i<n;i++){
				if(c == (target>>i)%2)num++;
				else{
					if(result[m-index-1]!=num)return false;
					index++;
					num = 1;
					c = (target>>i)%2;
				}
			}
			if(result[m-index-1]!=num)return false;
			int z = 0;
			int o = 0;
			for(int i=0;i<n;i++){
				if((target>>i)%2==0)z++;
				else o++;
			}
			if(zero==z&&one==o)return true;
			return false;
		}
		
		int solve(ArrayList<Integer> kouho,char[] to){
			int result = Integer.MAX_VALUE/2;
			ArrayList<String> list = new ArrayList<String>();
			for(int i=0;i<kouho.size();i++){
				String a = "";
				for(int s=n-1;s>=0;s--)a+=((kouho.get(i)>>s)%2);
				list.add(a);
			}
//			System.out.println(list);
			
			for(int i=0;i<list.size();i++){
				int cnt = 0;
				boolean[] sw = new boolean[n];
				String target = list.get(i);
//				System.out.println(target);
				for(int s=0;s<n;s++)if(target.charAt(s)=='1'){
					for(int j=0;j<n;j++){
//						System.out.println(s+" "+j+" "+target.charAt(s)+" "+to[j]);
						if(to[j]==target.charAt(s)&&!sw[j]){
							sw[j] = true;
							cnt += Math.abs(j-s);
							break;
						}
//						System.out.println(Arrays.toString(sw));
					}
				}
				result = Math.min(cnt, result);
			}
			
			return result;
		}
		
		void doIt(){
			n = in.nextInt();
			m = in.nextInt();
			zero = 0;one = 0;
			char[] input = new char[n];
			for(int i=0;i<n;i++)input[i] = in.next().charAt(0);
			String input2 = "";
			for(int i=0;i<n;i++)input2+=input[i];
			result = new int[m];
			for(int i=0;i<m;i++)result[i] = in.nextInt();
			for(int i=0;i<n;i++){
				if(input[i]=='0')zero++;
				else one++;
			}
			ArrayList<Integer> kouho = new ArrayList<Integer>();
			for(int i=0;i<(1<<n);i++){
				if(calc(i))kouho.add(i);
			}
//			System.out.println(kouho);
//			for(int i=0;i<kouho.size();i++)System.out.println(Integer.toBinaryString(kouho.get(i)));
			System.out.println(solve(kouho,input));
		}
	}
	
}