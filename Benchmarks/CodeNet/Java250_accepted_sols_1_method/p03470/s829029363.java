import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int[] d = new int[n];
		
		List<Integer> list = new ArrayList<>();
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			int a = stdIn.nextInt();
			if(!list.contains(a)){
				list.add(a);
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
