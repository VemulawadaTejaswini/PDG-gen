import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String o="";
        long x=sc.nextLong();
        x=x%10;
        if(x==2||x==4||x==5||x==7||x==9)o="hon";
      	else if(x==3)o="bon";
      else o="pon";
      System.out.println(o);
    }
    
}