import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(n/3600 + ":"+ n%3600/60 + ":" + n%3600%60);
    }
}
