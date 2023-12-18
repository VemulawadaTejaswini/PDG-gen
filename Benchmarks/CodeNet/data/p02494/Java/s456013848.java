import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int h = scan.nextInt();
            int w = scan.nextInt();
            if (h == 0 && w == 0)
                break;

            StringBuilder sb = new StringBuilder();
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    sb.append('#');
                }
                sb.append('\n');
            }
            System.out.println(sb.toString());
        }
    }
}