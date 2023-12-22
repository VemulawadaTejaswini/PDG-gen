import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String[] array = scanner.nextLine().split(" ");
            int A = Integer.parseInt(array[0]);
            int B = Integer.parseInt(array[1]);
            int X = Integer.parseInt(array[2]);

            if (A <= X && X <= A + B) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}