import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


public class Main {
    /*public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(reader.readLine());
        while(q>0){
            q--;
        String[] l = reader.readLine().split(" ");
        int a = Integer.parseInt(l[0]);
        int b = Integer.parseInt(l[1]);
        int c = Integer.parseInt(l[2]);
        int n = Integer.parseInt(l[3]);
        int p=(a+b+c+n)/3;
        if((a+b+c+n)%3==0 && p-a>=0 && p-b>=0 && p-c>=0 ) System.out.println("YES");
        else System.out.println("NO");
    }}*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] l = reader.readLine().split(" ");
        long n = Long.parseLong(l[0]);
        long k = Long.parseLong(l[1]);
        String[] lo = reader.readLine().split(" ");
        if(k>=n){System.out.println(0);}
        else{

            long sum=0;
            long[] list = new long[lo.length];
            for(int i = 0;i<n;i++){
                list[i] = Long.parseLong(lo[i]);
            }
            Arrays.sort(list);
            for(int i = 0;i<n-k;i++){
                sum += list[i];
            }
            System.out.println(sum);
    }
    }
}

