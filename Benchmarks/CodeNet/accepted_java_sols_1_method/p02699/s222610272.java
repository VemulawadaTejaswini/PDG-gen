
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int sheep = sc.nextInt();
        int wolf = sc.nextInt();
        if (sheep <= wolf)
            System.out.println("unsafe");
        else
            System.out.println("safe");
    }

}

