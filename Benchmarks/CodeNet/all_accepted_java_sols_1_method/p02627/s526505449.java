import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char alpha = sc.next().charAt(0);

        if ('A' <= alpha && alpha <= 'Z') System.out.println("A");
        else System.out.println("a");

    }

}