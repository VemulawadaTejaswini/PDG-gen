import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);

            int num = -1;
            while (sc.hasNextInt() && (num = sc.nextInt()) != 0) {

                int count = 0;
                while (num >= 5) {
                    num /= 5;
                    count += num;
                }
                System.out.println(count);
            }
        } finally {
            sc.close();
        }
    }
}