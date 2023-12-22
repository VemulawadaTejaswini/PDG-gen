import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String frame = "";
        for (int i=0; i<w+2; i++) {
            frame += "#";
        }

        System.out.println(frame);
        for (int i=0; i<h; i++) {
            System.out.print("#");
            System.out.print(sc.next());
            System.out.println("#");
        }
        System.out.println(frame);
    }
}