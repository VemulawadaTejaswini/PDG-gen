import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String txt = scanner.nextLine();
        if (n % 2 == 1) {
            System.out.println("No");
        } else {
            char  [] str1 = txt.toCharArray();
            boolean isEcho = true;
            for (int i = 0, j = n/2; i < n/2; i++, j++){
                if (str1[i] != str1[j]) {
                    isEcho = false;
                    break;
                }
            }
            if (isEcho)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
