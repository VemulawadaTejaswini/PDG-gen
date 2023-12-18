import java.util.Arrays;
import java.util.Scanner;

//Bara-Bara Manju
public class Main{

	int[] c, u;
	int res;
	
	boolean f(int x, int rest){
		if(rest<0)return false;
		if(rest==0)return true;
		for(int i=x;i>0;i--)if(c[i]-u[i]>0){
			u[i]++;
			if(f(i, rest-i))return true;
			u[i]--;
		}
		return false;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			c = new int[11];
			for(int i=0;i<n;i++)c[sc.nextInt()]++;
			res = c[5]/2;
			c[5]%=2;
			for(int i=6;i<=9;i++){
				int t = Math.min(c[i], c[10-i]);
				res+=t;
				c[i]-=t;
				c[10-i]-=t;
			}
			u = new int[11];
			for(int i=9;i>0;i--)if(c[i]>0){
				Arrays.fill(u, 0);
				u[i]++;
				if(f(i, 10-i)){
					res++;
					for(int j=1;j<=9;j++)c[j]-=u[i];
					i++;
				}
			}
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}