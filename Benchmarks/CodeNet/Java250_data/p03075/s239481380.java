import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        //PrintWriter out = new PrintWriter(System.out);
        int[] a = new int[5];
        for(int i=0;i<5;i++) a[i]= sc.nextInt();
        int k = sc.nextInt();
        String ans = a[4]-a[0]<=k?"Yay!":":(";
        System.out.println(ans);
    }
}