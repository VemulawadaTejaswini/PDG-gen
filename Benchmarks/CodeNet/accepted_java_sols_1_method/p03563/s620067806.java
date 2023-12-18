import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int currentRate = Integer.parseInt(sc.nextLine());
        int goal = sc.nextInt();

        System.out.println(2 * goal - currentRate);

    }
}