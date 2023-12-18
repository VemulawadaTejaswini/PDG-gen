import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int n = a;
		
		for(;;){
			if ((n%2 == 0) && (n%a == 0)){
				break;
			}
			n = n+a;
		}
		System.out.println(n);			
		
	}

}
