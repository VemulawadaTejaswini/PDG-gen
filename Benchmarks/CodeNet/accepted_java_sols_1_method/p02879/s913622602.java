import java.util.*;
class Main{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int string = scanner.nextInt();
        if (string <= 9) {
            int a = string;
            string = scanner.nextInt();
            if (string <= 9) {
                int b = string;
                int c = a * b;
                System.out.println(c);

            }
            else{
                System.out.println("-1");
            }
        }
        else {
            System.out.println("-1");
        }
    }
}