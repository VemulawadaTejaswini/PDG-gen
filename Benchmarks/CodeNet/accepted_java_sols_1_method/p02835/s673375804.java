import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int a,b,c;
       a=in.nextInt();
       b=in.nextInt();
       c=in.nextInt();
       if((a+b+c)>=22){
           System.out.println("bust");
       }
       else{
           System.out.println("win");
       }
    }
    
}