import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        for (int i = 1, j = m + 1; i < j; i++, j--)
            System.out.println(i + " " + j);
        for (int i = m + 2, j = m * 2 + 1; i < j; i++, j--) {
            System.out.println(i + " " + j);
        }
    }

}
