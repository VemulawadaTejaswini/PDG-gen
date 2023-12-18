
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans=1;

		for(int i = 1 ; i <= B ; i++) {
			ans = K * i;
			if(ans >= A && ans <= B) {
				System.out.println("OK");
				break;
			}else if(ans > B){
				System.out.println("NG");
				break;
			}
		}



		sc.close();

	}

}
