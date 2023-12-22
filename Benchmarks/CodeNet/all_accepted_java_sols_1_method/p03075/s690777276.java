import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();
		String ans = "Yay!";
		if(e-a > k) {
			ans = ":(";
		}
		//for(int i = 0; i < n; i++) {
			
		//}
		System.out.println(ans);
		sc.close();
	}
	
}

