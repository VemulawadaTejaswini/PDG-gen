import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int search = 1;
        int broken = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == search) {
                search++;
                continue;
            }
            broken++;
        }

        if (broken == n) broken = -1;
        System.out.println(broken);
    }

}