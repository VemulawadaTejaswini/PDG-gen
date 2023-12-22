import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        if (N < 1000) {
            System.out.println("ABC");
        } else{
            System.out.println("ABD");
        }
    }
}
