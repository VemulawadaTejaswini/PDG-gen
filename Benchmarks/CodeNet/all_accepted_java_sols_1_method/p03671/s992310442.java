import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=Math.min(a,b);
        int e=Math.min(c,b);
        if(d!=e){
            System.out.println(d+e);
        }else{
            System.out.println(d+Math.min(a,c));
        }

        }
        
        
    }
