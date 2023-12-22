import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            String[] array = scanner.nextLine().split(" ");
            int a = Integer.parseInt(array[0]);
            int b = Integer.parseInt(array[1]);
            
            if (a <= b) {
                System.out.println(a);
            } else {
                System.out.println(a - 1);
            }
        }
    }
}