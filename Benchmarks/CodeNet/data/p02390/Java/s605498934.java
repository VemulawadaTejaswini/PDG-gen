import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); 
        int second = s % 60;
        int minuts = s / 60;
        int hour = minuts / 60;
        minuts = minuts % 60;

        System.out.printf("%d:%d:%d\n", hour, minuts, second);
        sc.close();
    }
}
