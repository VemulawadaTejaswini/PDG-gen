import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int s = 0;

        for (int i = 1;i <= n;i += 2){
            s++;
        }
        System.out.println((double)s / n);
    }
}