import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String o;
        String x=sc.next();
        String y=sc.next();
        if(y.length()-1==x.length()&&y.substring(0,y.length()-1).equals(x))o="Yes";
      	else o="No";
      	System.out.println(o);
    }
    
}