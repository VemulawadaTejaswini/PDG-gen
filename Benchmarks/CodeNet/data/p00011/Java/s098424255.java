import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int n = scanner.nextInt(); scanner.nextLine();
        int[] x = new int[30];
        for(int i = 0; i < w; i++)
            x[i] = i;

        for(int i = 0; i < n; i++){
            String s = scanner.nextLine();
            String[] a = s.split(",", 0);

            int tmp = x[Integer.parseInt(a[0]) - 1];
            x[Integer.parseInt(a[0]) - 1] = x[Integer.parseInt(a[1]) - 1];
            x[Integer.parseInt(a[1]) - 1] = tmp;

        }

        for(int i = 0; i < w; i++)
            System.out.println(x[i]+1);
    }
}

