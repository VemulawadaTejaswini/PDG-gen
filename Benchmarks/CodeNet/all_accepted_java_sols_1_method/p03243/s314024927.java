
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int ans = a/111;
		if(a%111 != 0) {
			ans+= 1;
		}
		
		System.out.println(ans*111);
	}

}