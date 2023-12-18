import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int a = s.nextInt();
      	int b;
      	for (int i = 1; i < N; i++){
        	b = s.nextInt();
          	int c = Math.max(a, b);
            b = Math.min(a,b);
            a = c;
          	while (b > 0){
              	a = a % b;
              	int d = Math.max(a, b);
                b = Math.min(a,b);
                a = d;
            }
        }
        System.out.println(a);
        
	}
}
