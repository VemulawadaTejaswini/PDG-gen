import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans;
		
		ArrayList<Integer> numArray = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			numArray.add(sc.nextInt());
		}
		
		Collections.sort(numArray);
		
		ans = numArray.get(N-1) - numArray.get(0);
		System.out.println(ans);
			
		
	}

}