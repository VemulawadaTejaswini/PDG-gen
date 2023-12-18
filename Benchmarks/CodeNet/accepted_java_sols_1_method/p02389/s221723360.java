import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int menseki = 0;
        int length = 0;
        menseki = a * b;
        length = 2 * a + 2 * b;
        System.out.println(menseki + " " +length);

    }
}
