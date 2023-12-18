import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if ( n1 > 12 ){
			System.out.println(n2);
		}else if ( n1> 5){
			System.out.println(n2/2);
		}else {
			System.out.println(0);
		}
	}

}