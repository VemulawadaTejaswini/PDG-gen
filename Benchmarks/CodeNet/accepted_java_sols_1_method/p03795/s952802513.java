import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        int N = sc.nextInt();

        out.println(N*800-(N/15)*200);
        

        sc.close();
    }
}