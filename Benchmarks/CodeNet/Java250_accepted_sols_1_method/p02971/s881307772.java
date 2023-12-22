import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int no1 = -1;
		int index = 0;
		int no2 = -1;
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if(x >= no1) {
				no2 = no1;
				no1 = x;
				index = i;
			}
			else if(x > no2) {
				no2 = x;
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.println((i != index)?no1:no2);
		}
	}
}