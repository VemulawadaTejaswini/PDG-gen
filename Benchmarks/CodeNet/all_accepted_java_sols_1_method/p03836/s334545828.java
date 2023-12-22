import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();

        int dx = tx - sx;
        int dy = ty - sy;

        char[] pathThere = new char[dx + dy];
        for (int i = 0; i < dx; i++) {
            pathThere[i] = 'R';
        }
        for (int i = 0; i < dy; i++) {
            pathThere[dx + i] = 'U';
        }

        char[] pathBack = new char[dx + dy];
        for (int i = 0; i < dx; i++) {
            pathBack[i] = 'L';
        }
        for (int i = 0; i < dy; i++) {
            pathBack[dx + i] = 'D';
        }

        StringBuilder sb = new StringBuilder();
        sb.append(pathThere);                              // first time there
        sb.append(pathBack);                               // first time back
        sb.append("DR").append(pathThere).append("UL");    // second time there
        sb.append("UL").append(pathBack).append("DR");     // second time there
        System.out.println(sb.toString());

    }
}
