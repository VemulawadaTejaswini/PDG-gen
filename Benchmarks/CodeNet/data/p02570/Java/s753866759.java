import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        int s = in.nextInt();
        int t = in.nextInt();
            if ((s * t) == d) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
    }

}
