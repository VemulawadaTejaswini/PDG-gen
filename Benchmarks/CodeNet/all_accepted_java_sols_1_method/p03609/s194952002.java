import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t = sc.nextInt();

        if (t<=x)
            System.out.println(x-t);
        else
            System.out.println("0");
    }
}
