import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> dList = new ArrayList<>();
		long ans = 0;
		
		for(int i = 0; i < N; i++) {
			dList.add(sc.nextInt());
		}

		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				ans += dList.get(i) * dList.get(j);
			}
		}

		System.out.println(ans);
		sc.close();
	}
 
}