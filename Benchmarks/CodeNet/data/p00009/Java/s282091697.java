import java.util.*;

class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().new aizu0009().run();
	}
	class pku1207{
		void run(){
			Scanner sc=new Scanner(System.in);
			while(sc.hasNextInt()){
				int a=sc.nextInt(),b=sc.nextInt(),ans=0;
				for(int i=Math.min(a, b	);i<=Math.max(a,b);i++){
					ans=Math.max(ans, calc(i));
				}
				System.out.println(a+" "+b+" "+ans);
			}
		}
		int calc(int n){
			int ret=1;
			while(n>1){
				n=n%2==0?n/2:3*n+1;
				ret++;
			}
			return ret;
		}
	}
	class aizu0009{
		void run(){
			notPrime=new boolean[MX];
			ans=new int[MX];
			
			for(int i=2;i*i<MX;i++)if(!notPrime[i])for(int j=i+i;j<MX;j+=i)notPrime[j]=true;
			for(int i=2;i<MX;i++)ans[i]=ans[i-1]+(notPrime[i]?0:1);
			
			Scanner sc=new Scanner(System.in);
			while(sc.hasNextInt()){
				int n=sc.nextInt();
				System.out.println(ans[n]);
			}
		}
		int MX=1000000;
		boolean[] notPrime;
		int[] ans;
	}
}