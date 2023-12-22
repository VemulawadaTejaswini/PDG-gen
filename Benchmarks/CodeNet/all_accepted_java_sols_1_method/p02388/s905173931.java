import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double pow = Math.pow(num, 3);
        int answer = (int)pow;
        System.out.println(answer);
    }
}