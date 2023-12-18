import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int S=in.nextInt();
        int h,m,s,a;
        h=S/3600;
        a=S%3600;
        m=a/60;
        s=a%60;
        System.out.println(h+":"+m+":"+s);
    }
}
