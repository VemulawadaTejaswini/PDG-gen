import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int d = sc.nextInt();
        int x2000 = sc.nextInt();

        for (int i = 0; i<10; i++){
            int cu = (x2000*r) - d;
            System.out.println(cu);
            x2000 = cu;
        }
    }
}