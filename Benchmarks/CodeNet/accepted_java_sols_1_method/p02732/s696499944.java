import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ball=new int[n];
        long[] num=new long[n];
        for(int i=0;i<n;i++){
            ball[i]=sc.nextInt();
            num[ball[i]-1]++;
        }
        long gt=0;
        for(int i=0;i<n;i++){
            gt+=num[i]*(num[i]-1)/2;
        }
        for(int i=0;i<n;i++){
            System.out.println(gt-(num[ball[i]-1]-1));
        }
    }
}