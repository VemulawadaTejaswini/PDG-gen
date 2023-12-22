import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int emp[] = new int[num];
        for (int i = 0; i < num - 1; i++) {
            int id = scanner.nextInt();
            emp[id - 1]++;
        }
        for (int i = 0; i < num; i++) {
            System.out.println(emp[i]);
        }
    }
}
