import java.util.*;

public class Main{
    public static void main(String[] srgs){
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        if(a+b==3)c=3;
        if(a+b==4)c=2;
        if(a+b==5)c=1;
        System.out.println(c);
    }
}
