import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int d = scan.nextInt();
        int x = scan.nextInt();
        int out = 0;
        for(int i = 0; i < 10; i++){
            out = r * x - d;
            System.out.println(out);
            x = out;
        }
    }
}