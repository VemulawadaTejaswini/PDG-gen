import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] r = new int[N];
    	for (int i = 0; i < N; i++) {
    		r[i] = sc.nextInt();
    	}
    	int index = 1;
    	int crush = 0;
    	boolean can = false;
    	for (int i = 0; i < N; i++) {
    		if (r[i] == index) {
    			can = true;
    			index++;
    			continue;
    		} else {
    			crush++;
    		}
    	}
    	System.out.println(can ? crush : -1);
    }
}