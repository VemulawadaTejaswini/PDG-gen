import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        long ans = (long) Math.pow(3,n);
        long sub = 1;
        for(int i=0;i<n;i++){
            if(a[i]%2==0) sub *=2;
        }
        System.out.println(ans-sub);
    }
}
