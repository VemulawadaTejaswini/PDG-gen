import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int s =k;
		
		while(true) {
			if(a<=k && k <= b) {
				System.out.println("OK");
				break;
			}else if(b<k) {
				System.out.println("NG");
				break;
			}
			k+=s;
		}
	}
	
}