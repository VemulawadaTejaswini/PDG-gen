import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int n = scanner.nextInt();
        int kujis[] = new int[w];
        for (int i = 0; i < w; i++) {
            kujis[i] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            String line = scanner.next();
            int a = Integer.valueOf(line.split(",")[0]) - 1;
            int b = Integer.valueOf(line.split(",")[1]) - 1;
            int tmp = kujis[a];
            kujis[a] = kujis[b];
            kujis[b] = tmp;
        }
        for (int i = 0; i < w; i++) {
            System.out.println(kujis[i]);
        }
        scanner.close();
    }
}

