import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int a=sc.nextInt();
        a%=10;
        if(a==3)
            System.out.println("bon");
        else if(a==0||a==1||a==6||a==8)
            System.out.println("pon");
        else System.out.println("hon");



    }
}
