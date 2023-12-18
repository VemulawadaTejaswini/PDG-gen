import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		sc.close();

		char n1 = N.charAt(0);
		char n2 = N.charAt(1);
		char n3 = N.charAt(2);
		
		String ans = "No";
		if(n1=='7' || n2=='7' || n3=='7'){
			ans = "Yes";
		}
		
		System.out.printf("%s\n", ans);
	}
}