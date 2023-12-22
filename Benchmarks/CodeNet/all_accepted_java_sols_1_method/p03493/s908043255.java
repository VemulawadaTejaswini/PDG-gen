import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int counter = 0;
        char[] in = s.next().toCharArray();
        for (int i = 0; i < 3; i++) {
            if (in[i] == '1') {
                counter++;
            }
        }

        System.out.println(counter);
    }
}