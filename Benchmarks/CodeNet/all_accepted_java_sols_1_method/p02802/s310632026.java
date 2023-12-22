import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=0,m=0,k=0;

        if(scan.hasNext())
            n=scan.nextInt();

        if(scan.hasNext())
            m=scan.nextInt();
        String str="";
        boolean[] brr=new boolean[n];
        int[] arr=new int[n];
        for(int i=0;i<m;i++){
            if(scan.hasNext())
                k=scan.nextInt();
            if(scan.hasNext())
                str=scan.next();
            if(str.equals("AC")){
                brr[k-1]=true;
            }else{
                if(!brr[k-1]){
                    arr[k-1]+=1;
                }
            }
        }
        int ca=0,pen=0;
        for(int i=0;i<n;i++){
            if(brr[i]){
                ca++;
                pen+=arr[i];
            }
        }
        System.out.println(ca+" "+pen);
    }
}
