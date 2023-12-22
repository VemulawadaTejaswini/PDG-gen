import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a =sc.nextInt();
        b =sc.nextInt();
        c =sc.nextInt();
        int max =0;
        if(max<10*a+b+c)max=10*a+b+c;
        if(max<10*a+c+b)max=10*a+c+b;
        if(max<10*b+c+a)max=10*b+c+a;
        if(max<10*b+a+c)max=10*b+a+c;
        if(max<10*c+a+b)max=10*c+a+b;
        if(max<10*c+b+a)max=10*c+b+a;
        System.out.println(max);
    }
}
