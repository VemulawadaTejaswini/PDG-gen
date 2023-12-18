import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		sc = null;
		if((a<c && c<b) || (b<c && c<a)) System.out.println("Yes"); 
		else System.out.println("No");
	}
}
