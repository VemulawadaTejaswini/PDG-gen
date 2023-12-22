import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int pL = l % 2019;
        int pR = r % 2019;
        
        int min = Integer.MAX_VALUE;
        if(r - l >= 2019 || l <= 2019 && 2019 <= r)
        	min = 0;
        else {
        	for(int i = pL; i <= pR; i++) {
        		for(int j = pL; j <= pR; j++) {
        		    if(j == i) continue;
        			min = Math.min(min, i * j % 2019);
        		}
        	}
        }
        System.out.println(min);
    }
}
