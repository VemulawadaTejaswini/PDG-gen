import java.util.Scanner;

public class Main {
    //Apple Pie
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int p = sc.nextInt();
        int max = (a * 3 + p) / 2;
        System.out.println(max);
    }
}
