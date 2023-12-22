import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        int[] ary=new int[10000];
        boolean big=false,flag=true;
        ary[0]=2;
        int i=3,j=0;
        for(;i<1000000;i++){
            flag=true;
            if(ary[j]>=x)break;
            for(int k=0;k<=j;k++){
                if(i%ary[k]==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                j++;
                ary[j]=i;
            }
        }
        System.out.println(ary[j]);
    }
}