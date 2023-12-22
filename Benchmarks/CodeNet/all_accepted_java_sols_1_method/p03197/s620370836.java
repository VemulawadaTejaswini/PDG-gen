import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        boolean flag = true;
        for(int i=0;i<n;i++) flag &= (a[i]%2==0);
        String ans = flag?"second":"first";
        System.out.println(ans);
    }
}