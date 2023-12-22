import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean flag = true;
		if(s.length()%2==0) {
			for (int i = 0; i < s.length(); i+=2) {
				if(s.charAt(i)!='h'||s.charAt(i+1)!='i')flag = false;
			}
		}else {
			flag = false;
		}
		if(flag)System.out.println("Yes");
		else System.out.println("No");
		sc.close();
	}
}