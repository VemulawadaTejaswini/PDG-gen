
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();

		while(sc.hasNext()) {

			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();

			if(m == -1 && f == -1 && r == -1) {
			//	System.out.println("??????????????????");
				break;
			}

			if(m == -1 || f == -1) {
				list.add("F");
			}
			else if(80 <= m + f) {
				list.add("A");
			}
			else if(65 <= m + f && m + f  < 80) {
				list.add("B");
			}
			else if(50 <= m + f && m + f  < 65) {
				list.add("C");
			}
			else if(30 <= m + f && m + f  < 50) {
				if(50 <= r) {
					list.add("C");
				}
				else {
					list.add("D");
				}
			}
			else if(m + f < 30) {
				list.add("F");
			}
		}

		for(String s : list) {
			System.out.println(s);
		}
	}
}