import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(), m =sc.nextInt();
        int[] rec = new int[m+1];
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            for(int j=0;j<k;j++){
                int a = sc.nextInt();
                rec[a] += 1;
            }
        }
        int ans=0;
        for(int i=1;i<=m;i++) {
            if(rec[i]==n) ans++;
        }
        System.out.println(ans);
    }
}
