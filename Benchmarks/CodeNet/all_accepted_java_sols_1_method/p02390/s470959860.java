import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        int second = new Scanner(System.in).nextInt();

        if (0 <= second && second < 86400) {

            int h = second / 3600;
            int m = (second - (h * 3600)) / 60;
            int s = (second - (h * 3600)) - (m * 60);

            System.out.println(h + ":" + m + ":" + s);
        }
    }
}

