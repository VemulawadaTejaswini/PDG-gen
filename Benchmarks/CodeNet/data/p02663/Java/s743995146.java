import java.io.*;
import java.util.Scanner;

class Main {

    public static void main(final String args[]) throws IOException {
        Scanner input = new Scanner(System.in);
        int H1 = (input.nextInt());
        int M1 = (input.nextInt());
        int H2 = (input.nextInt());
        int M2 = (input.nextInt());
        int K = (input.nextInt());
        int wakeTime = (H2-H1)*60+(M2-M1);//minutes
        System.out.println(wakeTime - K);

    }

}
