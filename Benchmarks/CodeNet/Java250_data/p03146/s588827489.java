import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
        int s = sc.nextInt();
        
        Set<Integer> numericalSequence = new HashSet<Integer>() {};
        
        int tmp = s;
        numericalSequence.add(s);
        int ans = 0;
        
        for (int i = 2; i < 1000000; i++) {
        	
        	if (tmp % 2 == 0) {
                tmp /= 2;
            } else {
                tmp = 3 * tmp + 1;
            }
        	
        	if (numericalSequence.add(tmp)) {
        		numericalSequence.add(tmp);
            } else {
            	ans = i;
                break;
            }
        	
        }

		
		System.out.println(ans);
	}
}