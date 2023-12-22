import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			ArrayList<Integer> use = new ArrayList<Integer>();
			for(int i=0;i<10;i++) {
				if ((n&(1<<i)) > 0) {
					use.add((1<<i));
				}
			}
			System.out.print(use.get(0));
			for(int i=1;i<use.size();i++) {
				System.out.print(" " + use.get(i));
			}
			System.out.println();
		}
	}

}