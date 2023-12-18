import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutes = 0;
        for (int i = 0; i < 4; i++) {
            minutes += sc.nextInt();
        }
        System.out.println(minutes / 60);
        System.out.println(minutes % 60);
    }
}

