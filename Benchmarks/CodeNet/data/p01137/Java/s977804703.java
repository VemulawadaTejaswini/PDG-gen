import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		solve100();
	}

	public static void solve100(){
		Scanner sc = new Scanner(System.in);
		while(true) {
			int e = sc.nextInt();
			if(0==e) {
				break;
			}
			int m = 0;
			int x = 0;
			int y = 0;
			int z = 0;

			//yループ確認3乗と同じならzに値を入れてbreak;
			for(int i=2;i*i*i<=e;i++) {
				if(e==(i*i*i)) {
					e=0;
					z=i;
					break;
				}
			}

			//zループ確認2乗と同じならyに値を入れてbreak;
			for(int i=2;i*i<=e;i++) {
				if(e==(i*i)) {
					e=0;
					y=i;
					break;
				}
			}

			//zループ2以上e=z*z*zならbraek;
			for(int i=2;e!=0;i++) {
				if(e<(i*i*i)) {
					e-=(i-1)*(i-1)*(i-1);
					z=i-1;
					break;
				}
			}

			//yループ2以上e=x*xならbreak;
			for(int i=2;e!=0;i++) {
				if(e<(i*i)) {
					e-=(i-1)*(i-1);
					y=i-1;
					break;
				}
			}

			//x=e;
			x=e;

			m=x+y+z;
			if(m==50) {m=44;}
			System.out.println(m);
		}
	}

}
