import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h =sc.nextInt(), n = sc.nextInt();
		int usm=0;
		for(int i=0;i<n;i++) usm += sc.nextInt();
		if(usm>=h) System.out.println("Yes");
		else System.out.println("No");
	}
}