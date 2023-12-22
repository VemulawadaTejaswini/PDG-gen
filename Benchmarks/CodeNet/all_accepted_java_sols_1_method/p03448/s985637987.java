import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int cnt = 0;
		
		for(int a_cnt=0 ; a_cnt<=a ; a_cnt++) {
			for(int b_cnt=0 ; b_cnt<=b ; b_cnt++) {
				for(int c_cnt=0 ; c_cnt<=c ; c_cnt++) {
					if( (a_cnt*500+b_cnt*100+c_cnt*50) == x ) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}

}
