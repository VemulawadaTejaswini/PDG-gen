import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                long X = scan.nextLong();

                long ganpon = 100;

                long year = 0;

                while (ganpon < X) {
                        year++;
                        ganpon *= 1.01;
                }

                System.out.println(year);
        }

}