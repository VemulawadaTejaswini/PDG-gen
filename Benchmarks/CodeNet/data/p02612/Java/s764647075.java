import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N % 1000 == 0)
            System.out.println(0);
        else
            System.out.println(1000 - N % 1000);
    }
}
