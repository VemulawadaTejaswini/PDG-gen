import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	List<Integer> bi = Arrays.asList(2, 4, 8, 16, 32, 64);
    	for (int i = N; 1 < i; i--) {
    		if (bi.contains(i)) {
    			System.out.println(i);
    			System.exit(0);
    		}
    	}
    	System.out.println(1);
    }
}