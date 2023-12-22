import java.io.*;
import java.util.*;
import java.lang.Math;
import java.util.Arrays;

public class Main {
    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, x;
        MainRoop : while(true){
            n = sc.nextInt();
            x = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++)a[i] = i + 1;

            if(n == 0 && x == 0)break MainRoop;

            int ans = 0;
            for(int i = 0; i < n; i++){
                for(int j = i + 1; j < n; j++){
                    for(int k = j + 1; k < n; k++){
                        if(a[i] + a[j] + a[k] == x)ans++;
                    }   
                }
            }
            System.out.println(ans);
        }
    }
  
}
