import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        int k = sc.nextInt();
        Integer hp[] = new Integer[n];
        for(int i = 0; i < n; i++){
        	hp[i] = sc.nextInt();
        }
        Arrays.sort(hp, Collections.reverseOrder());
        long ans = 0;
        for(int i = k; i < n; i++){
        	ans += hp[i];
        }
        System.out.println(ans);
    }
}