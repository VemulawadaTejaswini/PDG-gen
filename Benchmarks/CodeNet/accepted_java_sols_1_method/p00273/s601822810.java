import java.util.Scanner;

public class Main{
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for(int i=0;i<n;i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int b = sc.nextInt();
			int p = sc.nextInt();

			int ans = x*b + y*p;

			if(b>=5 && p>=2){
				ans = (x*b + y*p)*4/5;
			}else{
				if(b<5){
					b=5;
				}
				if(p<2){
					p=2;
				}
				int wari = (x*b + y*p)*4/5;

				if(ans>wari){
					ans = wari;
				}
			}
			System.out.println(ans);
		}
	}
}