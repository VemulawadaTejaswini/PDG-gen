import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[] an = new String[h];
        for (int i = 0; i < h; i++) {
            an[i] = sc.next();
        }

        String sh = "";
        for (int i = 0 ; i < w + 2; i++) { // edge width edge
            sh += "#";
        }

        System.out.println(sh);
        for (int i = 0; i < h; i++) {
            System.out.print("#");
            System.out.print(an[i]);
            System.out.print("#");
            System.out.println();
        }
        System.out.println(sh);
    }

}