import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] a = new char[h][w];
        for (int i = 0 ; i < h ; i++) {
            a[i] = sc.next().toCharArray();
        }
        for (int i = 0 ; i < w + 2 ; i++) {
            System.out.print('#');
        }
        System.out.print("\n");
        for (int i = 0 ; i < h ; i++) {
            System.out.print('#');
            for (int j = 0 ; j < w ; j++) {
                System.out.print(a[i][j]);
            }
            System.out.print('#');
            System.out.print("\n");
        }
        for (int i = 0 ; i < w + 2 ; i++) {
            System.out.print('#');
        }
        System.out.print("\n");
    }

}