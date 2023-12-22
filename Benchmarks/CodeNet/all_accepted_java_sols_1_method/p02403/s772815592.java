import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            int h = sc.nextInt();
            int l = sc.nextInt();

            if (h == 0 && l == 0) {
                break;
            } else {

                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < l; j++) {
                        System.out.print('#');
                    }
                    System.out.println();
                }

                System.out.println();
            }

        } while (true);
    }

}