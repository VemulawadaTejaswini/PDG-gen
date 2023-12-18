import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans1 = a*b;
        int ans2 = a*2+b*2;
        System.out.println(ans1 + " " + ans2);
    }
}

