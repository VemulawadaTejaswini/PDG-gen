import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        String ans = "No";
			
			for (int i=1; i<=9; i++){
				if (N % i == 0 && N / i <= 9){
					ans = "Yes";
				}
			}
			
			System.out.println(ans);
	}
}