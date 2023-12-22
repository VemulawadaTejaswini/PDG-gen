//https://atcoder.jp/contests/abc161/tasks/abc161_a

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);


        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        int temp1 = x;
        x = y; y =temp1;

        int temp2 = x;
        x = z; z = temp2;
        out.println(x + " " + y + " " + z);
        out.close();

    }


}


