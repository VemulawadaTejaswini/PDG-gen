import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet set = new HashSet();
        int count=0;
        
        int n = sc.nextInt();
        for (int i=0;i<n;i++) set.add(sc.nextInt());
        int q = sc.nextInt();
        for (int i=0;i<q;i++) {
            int t = sc.nextInt();
            if(set.contains(t)) count++;
        }
        System.out.println(count);
    }
}