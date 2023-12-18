import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max1 = 0;
        int max2 = 0;

        int max_index = 0;

        for (int i = 0; i < n; i++) {
            if (max1 < a[i]) {
                max2 = max1;
                max1 = a[i];
                max_index = i;
            } else if(max2 < a[i]) {
                max2 = a[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (max_index == i) {
                System.out.println(max2);
            } else {
                System.out.println(max1);
            }
        }
	}
}
