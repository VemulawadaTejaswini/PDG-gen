import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int s = scan.nextInt(), w = scan.nextInt();

        if(w >= s) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }

        scan.close();
        return;
    }
}