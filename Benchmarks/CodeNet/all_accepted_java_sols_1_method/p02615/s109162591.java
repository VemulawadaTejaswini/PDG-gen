import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        Integer[] a = new Integer[n];
        for(int i=0; i<n; i++){
            a[i] = stdIn.nextInt();
        }

        Arrays.sort(a, Collections.reverseOrder());

        long ans = 0l;
        for(int i=0; i<n; i++){
            if(i == 0){
                ans += 0;
            }else{
                ans += a[i/2];
            }
        }
        
        System.out.println(ans);
    }
}
