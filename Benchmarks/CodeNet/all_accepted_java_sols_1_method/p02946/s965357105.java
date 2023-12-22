import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int x = sc.nextInt();

        int from;
        int to;

        if (x-(k-1) >= -1000000)
            from = x-(k-1);
        else
            from = -1000000;
        if (x+(k-1) <= 1000000)
            to = x+(k-1);
        else
            to = 1000000;
        for (int i = from; i<=to; i++)
            System.out.print(i + " ");
    }
}