import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x >= 0 && x <= 1) {
            if (x == 0) {
                System.out.println(1);
            } else if (x == 1) {
                System.out.println(0);
            }
        } else {
            System.out.println("error");
        }
    }

}
