import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int aa = Math.abs(a - b);
        int bb = Math.abs(b - c);
        int cc = Math.abs(a - c);
        if(aa <= d && bb <= d || cc <= d) System.out.println("Yes");
        else System.out.println("No");
    }
}