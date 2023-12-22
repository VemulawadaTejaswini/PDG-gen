import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int H = in.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = in.nextInt();
            b[i] = in.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int count = 0;
        for (int i = N-1; i >= 0; i--){
            if(a[N-1] < b[i]){
                H -= b[i];
                count++;
                if (H <= 0){
                    break;
                }
            }
        }
        while(H > 0){
            H -=a[N-1];
            count++;
        }


        System.out.println(count);

        in.close();
    }
}
