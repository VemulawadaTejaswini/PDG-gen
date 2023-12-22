import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;


public class Main{
   

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int max=0;
        if(X==1){
            System.out.println(1);
        }else{
            for(int i=2;i<=(int)Math.pow(X,0.5);i++){
                for(int j=1;(int)Math.pow(i,j)<=X;j++){
                    if((int)Math.pow(i,j)>=max){
                        max=(int)Math.pow(i,j);
                    }
                }
            }
            System.out.println(max);
        }
        

    }

        
        
    }
