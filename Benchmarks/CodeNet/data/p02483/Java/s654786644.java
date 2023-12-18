import java.util.*;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xs[] = new int[3];

        for (int i = 0; i < 3; i++) {
            xs[i] = sc.nextInt();
        }

        Arrays.sort(xs);

        for (int i = 0; i < 3; i++) {
            System.out.print(xs[i]);
            if (i != 2) {
                System.out.print(' ');
            }
        }

        System.out.println();
    }
}