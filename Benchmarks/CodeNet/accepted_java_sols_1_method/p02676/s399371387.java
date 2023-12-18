import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String o="";
        int x=sc.nextInt();
        String y=sc.next();
        if(y.length()<=x)o=y;
      	else o=y.substring(0,x)+"...";
      System.out.println(o);
    }
    
}