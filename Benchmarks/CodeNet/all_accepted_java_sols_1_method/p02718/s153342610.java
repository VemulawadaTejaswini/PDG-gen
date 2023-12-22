import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer[] a = new Integer[n];
        int votes = 0;
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            votes += a[i];
        }
        
        Arrays.sort(a, Collections.reverseOrder());
        
        for(int j=0; j<m; j++){
            if(a[j] < votes*((double)1/(4*m))){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}