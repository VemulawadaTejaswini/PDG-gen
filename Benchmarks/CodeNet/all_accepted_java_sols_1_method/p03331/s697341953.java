import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;


public class Main{
   
   

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int min=100000;
        for(int i=1;i<N;i++){
            int sum=0;
            int a=N-i;
            String aa=String.valueOf(a);
            String bb=String.valueOf(i);
            for(int j=0;j<aa.length();j++){
                sum+=Integer.parseInt(""+aa.charAt(j));
            }
            for(int j=0;j<bb.length();j++){
                sum+=Integer.parseInt(""+bb.charAt(j));
            }
            if(sum<min){
                min=sum;
            }
            


        }
        System.out.println(min);


        
        

    }

        
        
    }
