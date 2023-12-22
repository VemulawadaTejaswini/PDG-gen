import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();

		int x = 999;
		int y = 999;
		int cnt = 0;
		
		while(x != 0 || y != 0) {
			x = sc.nextInt();
			y = sc.nextInt();
			if(x == 0 && y == 0) {
				break;
			} else if(x < y) {
				cnt = cnt + 2;
				al.add(x);
				al.add(y);
			} else if(x > y) {
				cnt = cnt + 2;
				al.add(y);
				al.add(x);
			} else {
				cnt = cnt + 2;
				al.add(x);
				al.add(y);
			}
		}
		
		int i = 0;
		while(i < cnt) {
			System.out.println(al.get(i) + " " + al.get(i+1));
			i = i + 2;
		}
	
	}
}