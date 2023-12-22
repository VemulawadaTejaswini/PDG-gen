import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int a=sc.nextInt();
        int b=sc.nextInt();
        int flag=0;
        for(int i=b*10;i<=b*10+9;i++)
            if((int)(i*0.08)==a) {
                System.out.println(i);
                flag++;
                break;
            }
        if(flag==0)
            System.out.println("-1");

    }
}