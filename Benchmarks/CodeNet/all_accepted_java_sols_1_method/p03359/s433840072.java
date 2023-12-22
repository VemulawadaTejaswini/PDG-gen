import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.next();
        String str2 = scan.next();

        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);

        if(a>b)
            System.out.println(a-1);
        else
            System.out.println(a);
    }
}