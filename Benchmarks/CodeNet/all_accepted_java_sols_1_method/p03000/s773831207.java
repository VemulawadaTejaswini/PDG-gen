import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int l[] = new int[n];

        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }

        int bound = 1;
        int coordinate = 0;

        for (int i = 0; i < n; i++) {
            coordinate += l[i];
            if (coordinate <= x){
                bound++;
            }
        }
        System.out.println(bound);

        sc.close();
    }
}