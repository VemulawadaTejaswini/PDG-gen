import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n % 1000;
        if (a != 0)
            a = 1000 - a;

        System.out.println(a);

    }
}