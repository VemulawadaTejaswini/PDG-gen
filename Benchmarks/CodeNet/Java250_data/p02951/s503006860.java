import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a!=b){
            if (c>(a-b))
                System.out.println(c-(a-b));
            else
                System.out.println(0);
        }
        else
            System.out.println(c);
    }
}
