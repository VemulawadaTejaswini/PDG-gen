import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        
        int max = 0;
        int max_index = 0;
        for(int i = 0; i < n; i++) {
            int li = sc.nextInt();
            if(max < li) {
                max = li;
                max_index = i;
            }
            l[i] = li;
        }
        
        int sum = 0;
        for(int i = 0; i < n; i++) {
            if(i != max_index) {
                sum += l[i];
            }
        }
        
        if(max < sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }           
}