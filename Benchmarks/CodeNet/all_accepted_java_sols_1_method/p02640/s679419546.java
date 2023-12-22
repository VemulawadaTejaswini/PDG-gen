import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String o="No";
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(y%2==0&&2*x<=y&&y<=4*x)o="Yes";
      System.out.println(o);
    }
    
}