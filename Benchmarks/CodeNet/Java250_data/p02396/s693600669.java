import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		
		int i = 0;
		int cnt = 0;
		int x = 999;
		while(x != 0) {
			x = sc.nextInt();
			if(x == 0) {
				break;
			} else {
				cnt++;
				al.add(x);
			}
		}
		
		while(i < cnt) {
			i++;
			System.out.println("Case " + i + ": " + al.get(i-1));
		}
		
		
	}
}