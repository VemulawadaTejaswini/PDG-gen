import java.io.*;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        while (true) {
            long l1 = Long.parseLong(in.next());
            long l2 = Long.parseLong(in.next());
            
            if (l1 == 0 && l2 == 0) 
                break;

            if (l2 < l1) {
                long tmp = l1;
                l1 = l2;
                l2 = tmp;
            }

            System.out.println(l1 + " " + l2);
        }
    }
}