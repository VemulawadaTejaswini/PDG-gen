import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int a = scan.nextInt();
		
		if(n>=m&&n>=a) {
			System.out.println(m+a);
		}else if(m>=n&&m>=a) {
			System.out.println(n+a);
		}else {
			System.out.println(n+m);
		}

	}

}