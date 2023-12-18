import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String ans = "";

        switch (N){
            case 1:
                ans = "Hello World";
                break;
            case 2:
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                ans = Integer.toString(a+b);
                break;
        }
        System.out.println(ans);
        scanner.close();
    }
}
