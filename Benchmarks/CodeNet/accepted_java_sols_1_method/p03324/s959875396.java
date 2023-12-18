import java.util.*;

public class Main {
	public static void main(String[] orgs) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();

		if(D == 0&&N == 100){
			System.out.println(101);
		}else if(D == 1&&N == 100){
			System.out.println(10100);
		}else if(D == 2&&N ==100){
			System.out.println(1010000);
		}else{
			System.out.println(Math.round(N * Math.pow(100,D)));
		}
	}
}