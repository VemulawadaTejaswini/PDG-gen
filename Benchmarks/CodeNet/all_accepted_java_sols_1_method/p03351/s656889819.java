import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;


public class Main{
   

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=Math.abs(a-b);
        int f=Math.abs(b-c);
        if((Math.abs(a-c)<=d)||((e<=d)&&(f<=d))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        

    }

        
        
    }
