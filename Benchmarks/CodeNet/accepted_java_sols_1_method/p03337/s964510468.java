import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            String[] array = scanner.nextLine().split(" ");
            int a = Integer.parseInt(array[0]);
            int b = Integer.parseInt(array[1]);

            int p = a + b;
            int d = a - b;
            int m = a * b;
            
            if (p <= d && m <= d) {
                System.out.println(d);
            } else if (p <= m) {
                System.out.println(m);
            } else {
                System.out.println(p);
            }
        }
    }
}