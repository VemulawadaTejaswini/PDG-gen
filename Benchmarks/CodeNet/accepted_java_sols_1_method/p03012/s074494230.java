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
        int w[]=new int[n];
        for (int i=0;i<n;i++){
            w[i]=sc.nextInt();
            if (i>0){
                w[i]+=w[i-1];
            }
        }
        int min=Integer.MAX_VALUE;
        for (int i=1;i<n;i++){
            if (Math.abs(w[i-1]-(w[n-1]-w[i-1]))<min){
                min=Math.abs(w[i-1]-(w[n-1]-w[i-1]));
            }
        }
        System.out.println(min);
    }


}

