import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int y = Integer.parseInt(a+b);
		double r = (Math.sqrt(y));
	if(r-(int)r==0) {
		System.out.println("Yes");
	}
	else { 
		System.out.println("No");
		}
    }
}



