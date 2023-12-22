import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String r = sc.next();
        String g = sc.next();
        String b = sc.next();
        String f = r+g+b;

        int fi = Integer.parseInt(f);
        if (fi%4 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
