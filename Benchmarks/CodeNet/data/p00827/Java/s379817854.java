import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int d = sc.nextInt();
			if(a==0) {
				break;
			}
			int[] m = new int[2];
			Ans[] ans = new Ans[4];
			for(int i=0;i<4;i++) {
				ans[i] = new Ans();
			}
			for(int i=2;i<=3;i++) {
				ans[i].m = 1000000;
			}
			for(int i=0;i<2;i++) {
				if(i==0) {
					m[0] = d;
					m[1] = 0;
				}else{
					m[0] = 0;
					m[1] = d;
				}
				while(m[0]!=m[1]) {
					ans[i].m++;
					if(m[0]<m[1]) {
						m[0]+=a;
						ans[i].x++;
						ans[i].w+=a;
					}else{
						m[1]+=b;
						ans[i].y++;
						ans[i].w+=b;
					}
				}
			}
			for(int i=1;i*a<d;i++) {
				if((d-i*a)%b==0) {
					ans[2].m = i+(d-i*a)/b;
					ans[2].w = d;
					ans[2].x = i;
					ans[2].y = (d-i*a)/b;
					break;
				}
			}
			for(int i=1;i*b<d;i++) {
				if((d-i*b)%a==0) {
					ans[3].m = i+(d-i*b)/a;
					ans[3].w = d;
					ans[3].x = (d-i*b)/a;
					ans[3].y = i;
					break;
				}
			}
			Arrays.sort(ans);
			System.out.println(ans[0].x +" "+ans[0].y);
		}
	}
}
class Ans implements Comparable<Ans>{
	int m = 0;
	int w = 0;
	int x = 0;
	int y = 0;
	@Override
	public int compareTo(Ans o) {
		if (this.m!=o.m) {
			if(this.m>o.m) {
				return 1;
			}else{
				return -1;
			}
		}else{
			if(this.w>o.w){
				return 1;
			}else if(this.w==o.w){
				return 0;
			}else{
				return -1;
			}
		}
	}

}