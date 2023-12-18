import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		
		if(((a == b)&&(a != c))||((a == c)&&(b != c))||((c == b)&&(a != c))){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}