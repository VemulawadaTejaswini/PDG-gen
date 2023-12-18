import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int k = 1;

        while ((x * k % 360) != 0) {
            k++;
        }

        System.out.println(k);

    }

}