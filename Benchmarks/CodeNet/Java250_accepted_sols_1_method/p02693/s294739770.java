import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int K = scan.nextInt();
                int A = scan.nextInt();
                int B = scan.nextInt();

                int syou = A/K;
                int hantei = K * syou;

                while (true) {
                        if (hantei > B) {
                                System.out.println("NG");
                                break;
                        }
                        if (hantei >= A) {
                                System.out.println("OK");
                                break;
                        }
                        hantei += K;
                }
        }
}