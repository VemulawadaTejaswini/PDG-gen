import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result1 = a/b;
        int result2 = a%b;
        double result3 = (double)a/b;

        System.out.println(result1 + " " + result2 + " " + String.format("%.5f", result3));

    }
}
