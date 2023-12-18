import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int c = (n*(n-1))/2;
        int d = (m*(m-1))/2;

        System.out.println(c+d);

    }
}

