import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		if(N.indexOf('7') >= 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");			
		}
	}
}
