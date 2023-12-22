import java.util.HashMap;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                long N = scan.nextLong();

                HashMap<Long, String> alphabetHash = new HashMap<Long, String>();
                alphabetHash.put((long)0, "a");
                alphabetHash.put((long)1, "b");
                alphabetHash.put((long)2, "c");
                alphabetHash.put((long)3, "d");
                alphabetHash.put((long)4, "e");
                alphabetHash.put((long)5, "f");
                alphabetHash.put((long)6, "g");
                alphabetHash.put((long)7, "h");
                alphabetHash.put((long)8, "i");
                alphabetHash.put((long)9, "j");
                alphabetHash.put((long)10, "k");
                alphabetHash.put((long)11, "l");
                alphabetHash.put((long)12, "m");
                alphabetHash.put((long)13, "n");
                alphabetHash.put((long)14, "o");
                alphabetHash.put((long)15, "p");
                alphabetHash.put((long)16, "q");
                alphabetHash.put((long)17, "r");
                alphabetHash.put((long)18, "s");
                alphabetHash.put((long)19, "t");
                alphabetHash.put((long)20, "u");
                alphabetHash.put((long)21, "v");
                alphabetHash.put((long)22, "w");
                alphabetHash.put((long)23, "x");
                alphabetHash.put((long)24, "y");
                alphabetHash.put((long)25, "z");


                long len = 1;

                while (N - Math.pow(26, len) > 0) {
                	N -= Math.pow((long)26, len);
                	len++;
                }

                N--;

                while (len > 0) {
                	long temp = N/(long)Math.pow(26, len-1);
                	System.out.print(alphabetHash.get(temp));
                	N %= Math.pow(26, len-1);
                	len--;
                }

                System.out.println();

                scan.close();

        }

}