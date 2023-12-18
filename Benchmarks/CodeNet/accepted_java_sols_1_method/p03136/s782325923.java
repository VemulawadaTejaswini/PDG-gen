import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        boolean ans = false;
        int max = 0;
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            if (max < l[i]) {
                sum += max;
                max = l[i];
            } else {
                sum += l[i];
            }
        }
        
        if (max < sum) {
            ans = true;
        }
        
        System.out.println(ans ? "Yes":"No");
    }

}