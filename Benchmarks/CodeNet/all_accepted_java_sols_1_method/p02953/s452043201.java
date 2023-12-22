import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int h[] = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        boolean increase = true;

        for (int i = 1; i < n; i++) {
            if (h[i-1] < h[i]) {
                h[i]--;
            } else {
                if (h[i-1] != h[i]) {
                    increase = false;
                }
            }
        }   

        if (increase) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
	}
}
