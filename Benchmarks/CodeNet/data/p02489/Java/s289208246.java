import java.io.*;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        long cnt = 1;
        Scanner in = new Scanner(System.in);

        while (true) {
            long l = Long.parseLong(in.next());
            
            if (l == 0) 
                break;

            System.out.println("Case " + cnt + ": " + l);
            cnt++;
        }
    }
}