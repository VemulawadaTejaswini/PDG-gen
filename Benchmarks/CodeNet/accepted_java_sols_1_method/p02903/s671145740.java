import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                sb.append(1);
            }
            System.out.print(sb.toString());
            sb.setLength(0);
            for (int j = a; j < w; j++) {
                sb.append(0);
            }
            System.out.println(sb.toString());
            sb.setLength(0);
        }
        sb.setLength(0);
        for (int i = b; i < h; i++) {
            for (int j = 0; j < a; j++) {
                sb.append(0);
            }
            System.out.print(sb.toString());
            sb.setLength(0);
            for (int j = a; j < w; j++) {
                sb.append(1);
            }
            System.out.println(sb.toString());
            sb.setLength(0);
        }

        sc.close();
    }
}
