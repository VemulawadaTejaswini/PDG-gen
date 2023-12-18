import java.util.*;
import java.io.*;
class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println((x / 3600) + ":" + (x % 3600 / 60) + ":" + (x % 60));
    }
}
