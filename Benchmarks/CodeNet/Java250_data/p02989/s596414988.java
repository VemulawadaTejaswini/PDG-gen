import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int first = sc.nextInt();
    	int min = first;
    	int max = first;
    	List<Integer> di = new ArrayList<>();
    	di.add(first);
    	for (int i = 1; i < N; i++) {
    		int d = sc.nextInt();
    		di.add(d);
    	}
    	Collections.sort(di);
    	int harf1 = di.get(N/2 - 1);
    	int harf2 = di.get(N/2);
    	if (harf1 != harf2) {
    		System.out.println(harf2 - harf1);
    	} else {
    		System.out.println(0);
    	}
    }
}