import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] array = new int[N];
    	for (int i = 0; i < N; i++) {
    		array[i] = sc.nextInt();
    	}
    	List<String> pattern = new ArrayList<>();
    	for (int i = 0; i < Math.pow(3, N); i++) {
    		String p = Integer.toString(i, 3);
    		if (p.length() < N) {
    			while (p.length() != N) {
    				p = "0" + p;
    			}
    		}
    		pattern.add(p);
    	}
    	int count = 0;
    	for (String s : pattern) {
    		int pro = 1;
    		for (int i = 0; i < s.length(); i++) {
    			if (s.charAt(i) == '0') {
    				pro *= array[i]-1;
    			} else if (s.charAt(i) == '1') {
    				pro *= array[i];
    			} else {
    				pro *= array[i]+1;
    			}
    		}
    		if (pro%2 == 0) {
    			count++;
    		}
    	}
    	System.out.println(count);
    }
}