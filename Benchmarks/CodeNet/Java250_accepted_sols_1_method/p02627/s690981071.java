import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int r=(int)'a';
        char taher = in.next().charAt(0);
        if ((int)taher>=r)
        System.out.print('a');
        else {
            System.out.print('A');
        }
    }
}