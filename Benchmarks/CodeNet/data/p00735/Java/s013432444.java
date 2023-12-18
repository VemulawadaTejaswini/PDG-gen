import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main(){
		new AOJ1154().doIt();
	}
	
	class AOJ1154{
		ArrayList<Integer> list;
		int N = 300010;
		boolean[] MondayPrime;
//		int N = 100;
		void doIt(){
			list = new ArrayList<Integer>();
			list = new ArrayList<Integer>();
			for(int i=2;i<N;i++)if(i%7==1||i%7==6)list.add(i);
			MondayPrime = new boolean[N];
			HashSet<Integer> set = new HashSet<Integer>();
			for(int i=0;i<list.size();i++)set.add(list.get(i));
			Arrays.fill(MondayPrime, true);
			for(int i=0;i<N;i++)if(set.contains(i)==false)MondayPrime[i] = false;
			for(int i=0;i<list.size();i++)if(MondayPrime[list.get(i)]){
				for(int s=list.get(i)*2;s<N;s+=list.get(i))MondayPrime[s]=false;
			}
			while(in.hasNext()){
				int n = in.nextInt();
				if(n==1)break;
				System.out.print(n+":");
				for(int i=0;i<=n;i++)if(MondayPrime[i]&&n%i==0)System.out.print(" "+i);
				System.out.println();
			}
		}
	}
	
}