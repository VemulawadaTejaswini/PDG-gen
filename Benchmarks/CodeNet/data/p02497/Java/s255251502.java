import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		while(true) {
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			if(m == -1 && f == -1 && r == -1) break;
			if(m == -1) m = 0;
			if(f == -1) f = 0;
			if(m + f >= 80) System.out.println("A");
			else if (m + f >= 65 && m + f < 80) System.out.println("B");
			else if (m + f >= 50 && m + f < 65) System.out.println("C");
			else if (m + f < 30) System.out.println("F");
			else if (m + f >= 30 && m + f < 50 && r >= 50) System.out.println("C");
			else System.out.println("D");
		}
	}

}