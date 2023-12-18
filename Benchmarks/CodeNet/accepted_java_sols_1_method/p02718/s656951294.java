import java.util.*;


public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int list[] = new int[n];
		double sum = 0;
		for (int i = 0; i < n; i++) {
		    list[i] = sc.nextInt();
		    sum += list[i];
		}
		//Arrays.sort(list, Collections.reverseOrder());
		
		int ans = 0;
		
		for (int j = 0; j < n; j++) {
		    if(list[j] >= sum / (4*m) ) {
		        ans++;
		    }
		        
		}
		
		if (ans >= m) {
		    System.out.println("Yes");
		} else {
		    System.out.println("No");
		}
	
		    
		
    }
}
