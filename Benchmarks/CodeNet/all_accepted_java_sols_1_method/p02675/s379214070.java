import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String na = String.valueOf(n);
		if((char)na.charAt(na.length()-1) == '2' ||(char)na.charAt(na.length()-1) == '4' ||(char)na.charAt(na.length()-1) == '5' ||(char)na.charAt(na.length()-1) == '7' ||(char)na.charAt(na.length()-1) == '9') {
			System.out.println("hon");
		}else if((char)na.charAt(na.length()-1) == '3' ) {
			System.out.println("bon");
		}else {
			System.out.println("pon");
		}
	}
	
}
