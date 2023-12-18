import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=a*b+1;
        c/=2;
        if(a==1||b==1)
            System.out.println("1");
        else
            System.out.println(c);

    }
}