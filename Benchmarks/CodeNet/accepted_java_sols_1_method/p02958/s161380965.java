import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> p = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			p.add(sc.nextInt());
		}
		sc.close();

		int count = 0;
		for(int i = 0; i < n; i++) {
			if(p.get(i)!=i+1) {
				count++;
			}
		}

		if(count<=2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
