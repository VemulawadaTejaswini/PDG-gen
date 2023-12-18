import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int W=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=Math.abs(a-b);
        if(c>W){
            System.out.println(c-W);
        }else{
            System.out.println(0);
        }
}
        
        
    }
