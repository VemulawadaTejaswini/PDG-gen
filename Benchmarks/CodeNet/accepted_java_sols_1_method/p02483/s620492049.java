import java.io.*;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        long min, mid, max;
        Scanner in = new Scanner(System.in);
        long l1 = Long.parseLong(in.next());
        long l2 = Long.parseLong(in.next());
        long l3 = Long.parseLong(in.next());
        
        if (l1 < l2) {
            if (l3 < l1) {
                min = l3;
                mid = l1;
                max = l2;
            } else if (l2 < l3) {
                min = l1;
                mid = l2;
                max = l3;
            } else {
                min = l1;
                mid = l3;
                max = l2;
            }
        } else {
            if (l3 < l2) {
                min = l3;
                mid = l2;
                max = l1;
            } else if (l1 < l3) {
                min = l2;
                mid = l1;
                max = l3;
            } else {
                min = l2;
                mid = l3;
                max = l1;
            }
        }

        System.out.println(min + " " + mid + " " + max);
    }
}