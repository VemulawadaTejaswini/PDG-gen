import java.io.*;
import java.util.*;
import java.lang.*;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() % 10;
        if (n == 3) {
            System.out.println("bon");
        }
        else if (n == 0 || n == 1 || n == 6 || n == 8) {
            System.out.println("pon");
        }
        else {
            System.out.println("hon");
        }
    }
}
