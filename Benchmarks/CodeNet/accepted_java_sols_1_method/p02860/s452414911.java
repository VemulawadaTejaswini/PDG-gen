import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       String s=sc.next();
       if(s.substring(0,n/2).equals(s.substring(n/2,n)) && n%2==0) System.out.println("Yes");
       else System.out.println("No");

    }
}