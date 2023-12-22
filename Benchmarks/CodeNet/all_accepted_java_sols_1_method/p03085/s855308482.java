
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String b = scanner.nextLine();

        String ret = "";
        for (char c: b.toCharArray()) {
            switch (c) {
                case 'A':
                    ret += "T";
                    break;
                case 'T':
                    ret += "A";
                    break;
                case 'C':
                    ret += "G";
                    break;
                case 'G':
                    ret += "C";
                    break;
            }
        }
        System.out.println(ret);
    }

}
