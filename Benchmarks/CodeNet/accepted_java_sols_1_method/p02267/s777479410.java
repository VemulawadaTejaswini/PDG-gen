import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a_count = scanner.nextInt();
        int[] a = new int[a_count + 1];
        for (int i = 0; i < a_count; i++) a[i] = scanner.nextInt();

        int b_count = scanner.nextInt();
        int[] b = new int[b_count];
        for (int i = 0; i < b_count; i++) b[i] = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < b_count; i++) {
            a[a_count] = b[i];
            int j = 0;

            while (a[j] != b[i])
                j++;

            if (a_count != j)
                count++;
        }

        System.out.println(count);
    }

}

