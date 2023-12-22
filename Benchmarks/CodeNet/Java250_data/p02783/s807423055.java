import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int A = sc.nextInt();
        int hitNum = (int)Math.ceil((double) H / A);

        System.out.print(hitNum);
    }
}