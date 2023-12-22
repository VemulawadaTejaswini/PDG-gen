import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int[] l = new int[n];

        int max = 0;
      	int max_i = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.next());
            if (num > max) {
                max = num;
              	max_i = i;
            }
            l[i] = num;
        }
      
        int sum = 0;
        for (int i = 0; i < n; i++) {
          	if (i == max_i) {
            	continue;
            }
            sum += l[i];
        }
      
        if (max < sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}