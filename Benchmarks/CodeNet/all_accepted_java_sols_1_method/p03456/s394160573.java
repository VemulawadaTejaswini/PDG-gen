import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0 ; i <= 1000 ; i++) {
            if (String.valueOf(i * i).equals(String.valueOf(a) +  String.valueOf(b))) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

}