
import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            int d = sc.nextInt();
			a.add(d);
		}
		Collections.sort(a);	
		int half = a.size()/2;

		System.out.println(a.get(half)-a.get(half-1));
   
        }
		
	}