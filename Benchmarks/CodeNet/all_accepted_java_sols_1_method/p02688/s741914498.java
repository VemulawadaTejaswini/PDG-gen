import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
       // int d = new int[K];
       List<Integer> a = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            int d = sc.nextInt();
			for (int j = 0 ; j < d ;j++){
				int c = sc.nextInt();
			if (!a.contains(c))	a.add(c);
            }
        }
		System.out.println(N - a.size());
	}
}