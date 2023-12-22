import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        String a=sc.next();
        int m=a.length();
        for(int i=0;i<m;i++)
            System.out.print("x");


    }
}
