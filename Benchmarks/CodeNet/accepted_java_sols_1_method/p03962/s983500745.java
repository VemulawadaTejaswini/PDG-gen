import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a=0,b=0,c=0,num=1;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a!=b)num++;
        if(a!=c&&b!=c)num++;
        System.out.println(num);
    }
}
