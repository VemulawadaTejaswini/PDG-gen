import java.util.*;
public class Main{
      public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int money=0;
 
            if(n<k){
                money=n*x;
                System.out.println(money);
            }else{
                money=k*x+(n-k)*y;
                System.out.println(money);
            }
       }
}