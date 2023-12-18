import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h, w;

        do {
            h = sc.nextInt();
            w = sc.nextInt();

            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            for (int i = 0; i < w; i++) {
                if ((i % 2) == 0) {
                    sb1.append("#");
                    sb2.append(".");
                } else {
                    sb1.append(".");
                    sb2.append("#");
                }
            }
            

            for (int j = 0; j < h; j++) {
                if ((j % 2) == 0) {
                    System.out.println(sb1);
                } else {
                    System.out.println(sb2);
                }

            }

            System.out.println();

        } while (!(h == 0 && w == 0));
    }
}