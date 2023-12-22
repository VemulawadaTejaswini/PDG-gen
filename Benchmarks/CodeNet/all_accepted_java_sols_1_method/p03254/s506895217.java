import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long a[] = new long[n];
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        int count = 0;
        int c;
        int max = 0;
        for(c = 0; c < n; c++){
            if(x >= a[c]){
                x -= a[c];
                count++;
            }else{
                break;
            }
        }
        if(x > 0 && count > 0 && c == n){
                count --;
        }
        
        System.out.println(count);
    }
}
