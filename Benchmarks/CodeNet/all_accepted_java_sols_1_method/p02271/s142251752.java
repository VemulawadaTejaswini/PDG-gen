import java.io.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int[] a = new int[n];
        int[] cmp = new int[40010];
        for(int i=0;i<n;i++){a[i]=scan.nextInt();}
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int bit=0;bit<(Math.pow(2,n));bit++){
            int sum=0;
            for(int i=0;i<n;i++){
                if((1&bit>>i)==1){
                    sum+=a[i];
                    //System.out.println(a[i]);
                    //System.out.println(sum);
                }
                //System.out.println();
            }
            cmp[sum]++;
            //System.out.println(sum);
        }
        int q=scan.nextInt();
        for(int i=0;i<q;i++){
            int m=scan.nextInt();
            if(cmp[m]>0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
