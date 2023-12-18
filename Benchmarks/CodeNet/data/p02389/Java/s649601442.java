import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int area = area(a, b);
        int perimeter = perimeter(a, b);
        System.out.println(area + " " + perimeter);
    }

    private static int area(int a, int b) {
        return a * b;
    }

    private static int perimeter(int a, int b) {
        return (2 * a) + (2 * b);
    }
}
