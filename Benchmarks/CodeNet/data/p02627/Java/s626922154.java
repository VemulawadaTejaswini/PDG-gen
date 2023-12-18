import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
      int sum = 0;
		
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            int d = sc.nextInt();
            sum = sum+d;
			a.add(d);
            }
      
      	int Q = sc.nextInt();
    
		for (int i = 0; i < Q; i++) {
          int b = sc.nextInt();
          int c = sc.nextInt();
			
          int freq = Collections.frequency(a, b);
          if(Collections.replaceAll(a, b, c))
          {sum = sum + (c-b)*freq;}
          System.out.println(sum);       
        }
		
	}
 
}