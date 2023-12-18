
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner Input = new Scanner(System.in);
        int N = Input.nextInt();
        if (N == 1) {
            System.out.println("1");
        } else {
            int X = 1;
            while (X <= N) {
            X*=2;
            }
            System.out.println(X/2);
        }
    }

}
