import java.util.*;
import static java.lang.Math.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int max = 0;
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            max = max(max, a[i]);
        }
        int sum = 0;
        boolean flag = true;
        for(int i=0; i<n; i++){
            if(a[i] == max && flag){
                flag = false;
                continue;
            }
            sum += a[i];
        }
        System.out.println(sum > max ? "Yes" : "No" );
    }
}
