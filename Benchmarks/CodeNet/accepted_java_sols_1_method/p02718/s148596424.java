import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        int a[] = new int[n+1];
        int sum = 0;
        for(int i = 1; i <= n; i++){
            a[i] = cin.nextInt();
            sum += a[i];
        }
        int cnt = (sum)/(4*m);
        if(sum%(4*m) > 0) cnt++; 
        
        int num = 0;
        for(int i = 1; i <= n; i++){
            if(a[i] >= cnt) num++; 
        }
        if(num >= m) System.out.println("Yes");
        else System.out.println("No");
    }
}