import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	List<Integer> power = new ArrayList<>();
    	for (int i = 0; i < 3*N; i++) {
    		power.add(sc.nextInt());
    	}
    	long count = 0;
    	Collections.sort(power, Collections.reverseOrder());
    	for (int i = 1; i < 2*N; i+=2) {
    		count += power.get(i);
    	}
    	System.out.println(count);
    }
}