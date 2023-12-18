import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().run();
	}
	void run(){
		new AOJ1135();
	}
	
	class AOJ1135{
		AOJ1135(){
			int n=sc.nextInt();
			while(--n>=0)	solve();
		}
		void solve(){
			int m=sc.nextInt(),y=sc.nextInt(),n=sc.nextInt(),ans=0;
			while(--n>=0){
				int a=sc.nextInt();
				double rate = sc.nextDouble();
				int b=sc.nextInt();
				if(a==0){
					int mm=m,c=0;
					for(int i=0; i<y; ++i){
						c += (double)mm*rate;
						mm-=b;
					}
					ans=max(ans, mm+c);
				}else{
					int mm=m;
					for(int i=0; i<y; ++i){
						mm+=(double)mm*rate;
						mm-=b;
					}
					ans=max(ans, mm);
				}
			}
			System.out.println(ans);
		}
	}
	
	

}