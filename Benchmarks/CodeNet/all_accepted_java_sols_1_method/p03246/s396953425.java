//package bag;

import java.io.*;
import java.lang.reflect.Array;
import java.text.MessageFormat;
import java.util.*;

/**
 * Created by Enzo Cotter on 2019/4/30.
 */
public class Main {
    public static void main(String []args){
        Scanner input =new Scanner(System.in);
        int x;
        int []cot1=new int[1000005];
        int []cot2=new int[1000005];
        int n,a=0,b=0;
        n=input.nextInt();
        int reso1=0;
        int rese1=0;
        int reso2=0;
        int rese2=0;
        for(int i=1;i<=n;i++){
            x=input.nextInt();
            if(i==1)a=x;
            else if(i==2)b=x;
            if(i%2==1){
                cot1[x]++;
                if(reso1<cot1[x]) {
                    reso1 = cot1[x];
                    a = x;
                }
                if(a!=x) {
                    reso2 = Math.max(reso2, cot1[x]);
                }
            } else if(i%2==0){
                cot2[x]++;
                if(rese1<cot2[x]) {
                    rese1 = cot2[x];
                    b = x;
                }
                if(b!=x) {
                    rese2 = Math.max(rese2, cot2[x]);
                }
            }
        }
        //System.out.println(reso1+" "+reso2+" "+rese1+" "+rese2);
        if(a==b){
            System.out.println(Math.min(n-reso1-rese2,n-rese1-reso2));
        }else
            System.out.println(n-reso1-rese1);
    }
}
