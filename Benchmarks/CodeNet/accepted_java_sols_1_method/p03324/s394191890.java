import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int D = sc.nextInt();
    	int N = sc.nextInt();
    	int Dscore = (int) Math.pow(100, D);
    	int index = 0;
    	for (int i = 1;;i++) {
    		if (i%100 == 0) {
    			continue;
    		} else {
    			index++;
    			if (index == N) {
    				System.out.println(Dscore*i);
    				break;
    			}
    		}
    	}
    }
}