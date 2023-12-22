import java.util.ArrayList;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> brick = new ArrayList<>();
		int ans = 0;
		for(int i = 0; i < n; i++) {
			brick.add(sc.nextInt());
		}
		int index = 1; 
		
		for(int i = 1; i <= n; i++) {
			if(brick.get(i-1) == index) {
				index++;
			}else {
				ans++;
			}
		}
		
		System.out.println(index == 1 ? -1 : ans);
		sc.close();
	}
}
