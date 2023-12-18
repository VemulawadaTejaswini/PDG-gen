
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

    int a,b;

    a = sc.nextInt();
    b = sc.nextInt();

    if(a+b==15)
        System.out.println("+");
    else if(a*b==15)
        System.out.println("*");
    else
        System.out.println("x");
    }
}