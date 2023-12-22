import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a<6)
            System.out.println("0");
        else if (a<13)
            System.out.println(b/2);
        else
            System.out.println(b);
    }
}
