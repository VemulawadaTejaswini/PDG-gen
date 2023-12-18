import java.util.Scanner;

public class Main {

	static int gcd(int a, int b){

		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}
	
	static int calc(int a, int x, int m){
		return a*x%m;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(true){			
			int a[] = new int[3];
			int m[] = new int[3];
			int cnt[] = new int[3];
			int x;
			int flag=0;
			
			for(int i=0;i<3;i++){
				a[i]=stdIn.nextInt();
				m[i]=stdIn.nextInt();
				if(a[i]==0&&m[i]==0){
					flag++;
				}
			}
			
			if(flag==3){
				break;
			}
			
			for(int i=0;i<3;i++){
				x=1;
				while(true){
					x=calc(a[i],x,m[i]);
					cnt[i]++;
					if(x==1){
						break;
					}
				}
			}
			
			int gcd1 = gcd(cnt[0],cnt[1]);
			int gcd2 = gcd(cnt[0],cnt[2]);
			
			int lcm1 = cnt[0]/gcd1*cnt[1];
			int lcm2 = cnt[0]/gcd2*cnt[2];
			
			int gcd_ans = gcd(lcm1,lcm2);
			int lcm_ans = lcm1/gcd_ans*lcm2;
			
			System.out.println(lcm_ans);
		}
	}
}