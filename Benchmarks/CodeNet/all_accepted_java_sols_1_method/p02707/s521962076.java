import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ary=new int[n];
        for(int i=0;i<n-1;i++){
            ary[sc.nextInt()-1]++;
        }
        for(int e : ary){
            System.out.println(e);
        }
    }
}