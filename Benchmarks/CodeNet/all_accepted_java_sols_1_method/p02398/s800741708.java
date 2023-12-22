import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();

        int counter = 0;

        for (int i = a; i <= b; i++) {
            if (i != 0 && c%i == 0) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}

