import java.io.*;
import java.util.Scanner;

class Main {

    public static void main(final String args[]) throws IOException {
        Scanner input = new Scanner(System.in);
        byte H1 = (input.nextByte());
        byte M1 = (input.nextByte());
        byte H2 = (input.nextByte());
        byte M2 = (input.nextByte());
        int K = (input.nextByte());
        int wakeTime = (H2-H1)*60+(M2-M1);//minutes
        System.out.println(wakeTime - K);

    }

}

