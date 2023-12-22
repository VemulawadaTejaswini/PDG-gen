import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = 0;

            for(int i = a; i < b + 1 ; i++) {
                if (c%i == 0) {
                d++;
            }

        }
        System.out.println(d);
    }
}