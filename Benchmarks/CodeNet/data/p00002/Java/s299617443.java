import java.util.*;

class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        while (true) {

            try {
                a = sc.nextInt();
                b = sc.nextInt();
            } catch (NoSuchElementException e) {
                break;
            }

            System.out.println( (int)(Math.log10(a+b) + 1));

        }


    }
}