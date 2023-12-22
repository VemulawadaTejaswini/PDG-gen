import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Set<String> colors = new HashSet<>();

		for(int i=0;i<n;i++) {
			colors.add(sc.next());
		}
		if(colors.size()==4) {
			System.out.println("Four");
		}else {
			System.out.println("Three");
		}
	}
}