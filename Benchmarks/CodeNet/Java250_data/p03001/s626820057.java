import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double W = sc.nextDouble();
        double H = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double area = W*H/2;
        int isMulti = 0;
        if (x == W/2 && y == H/2) {
            isMulti = 1;
        }

        System.out.println(String.format("%.6f", area) + " " + isMulti);
    }

}