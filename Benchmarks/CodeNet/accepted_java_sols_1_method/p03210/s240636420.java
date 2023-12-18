import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D= sc.nextInt();
		if (D==7||D==5||D==3) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}