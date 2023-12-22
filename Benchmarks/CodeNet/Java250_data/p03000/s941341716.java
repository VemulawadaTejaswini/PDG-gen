import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int l[]=new int[n];
        for (int i=0;i<n;i++){
            l[i]=sc.nextInt();
        }
        int d[]=new int[n+1];
        d[0]=0;
        int cnt=0;
        for (int i=1;i<n+1;i++){
            d[i]=d[i-1]+l[i-1];
            if (d[i]<=x){
                cnt++;
            }
        }
        System.out.println(cnt+1);
    }


}

