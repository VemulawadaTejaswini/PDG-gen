import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
     
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int d = sc.nextInt();
			a.add(d);
            }
        Collections.sort(a);
			
		int price = 0;
		for (int j = 0; j < K; j++) {
			price += a.get(j);
		}
		System.out.println(price);
        }
		
}