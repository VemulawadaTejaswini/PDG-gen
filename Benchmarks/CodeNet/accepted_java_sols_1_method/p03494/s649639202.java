import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[] map = new int[N];
        for (int i = 0; i < N; i++) {
        	map[i] = sc.nextInt();
        }
        
        int count = 0;
        while(true) {
        	for (int i = 0; i < N; i++) {
            	if (map[i] % 2 != 0) {
            		System.out.println(count);
            		return;
            	} else {
            		map[i] /=2;
            	}
            }
        	count++;
        }
        
    }
    
}