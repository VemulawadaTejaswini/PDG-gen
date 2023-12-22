import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();
		
		str2 += str2;
		
		String res = str2.contains(str1) ? "Yes" : "No";
		
		System.out.println(res);
	}
  
}