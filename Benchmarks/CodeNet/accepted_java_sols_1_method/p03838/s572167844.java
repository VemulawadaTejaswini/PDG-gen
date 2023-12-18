import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();

        int c=Math.abs(a)-Math.abs(b);
        int d=Math.abs(c);
         
         if(c>0){
             if(a>0) d++;
             if(b>0) d++;
         }else{
             if(a<0) d++;
             if(b<0) d++;
         }
         System.out.println(d);
    }
}
