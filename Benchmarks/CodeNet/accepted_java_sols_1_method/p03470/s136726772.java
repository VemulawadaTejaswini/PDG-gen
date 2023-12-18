import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		
		Set<Integer> mochi = new HashSet<>();
		
		for(int i = 0; i < N; i++) {
			int d = sc.nextInt();
			mochi.add(d);
		}
		
		System.out.println(mochi.size());
		
		
	}

}
