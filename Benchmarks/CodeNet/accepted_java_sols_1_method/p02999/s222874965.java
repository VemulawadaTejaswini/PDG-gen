import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int x = kbd.nextInt();
        int a = kbd.nextInt();
        if (x < a) {
            System.out.println("0");
        }else{
            System.out.println("10");
        }
    }
}