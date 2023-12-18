import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            if(age == 7 || age == 5 || age == 3) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}