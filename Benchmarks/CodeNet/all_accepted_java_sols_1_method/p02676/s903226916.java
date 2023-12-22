import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int a=sc.nextInt();
        String b=sc.next();
        if(a<b.length())
            System.out.println(b.substring(0,a)+"...");
        else
            System.out.println(b);




    }
}
