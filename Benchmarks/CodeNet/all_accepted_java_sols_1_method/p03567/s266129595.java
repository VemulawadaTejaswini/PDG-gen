import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i,i+2).equals("AC")) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}