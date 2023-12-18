import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        
        if (str.length() < 4) {
            System.out.println("No");
            return;
        }

        if(str.substring(0, 4).contains("YAKI")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
