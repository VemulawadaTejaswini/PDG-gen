import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        String[] a = new String[H];

        for (int i = 0; i < H; i++) {
            a[i] = scanner.next();
        }
        for (int i = 0; i < W+2; i++) {
            System.out.print("#");
        }
        System.out.println("");
        for (int i = 0; i < H; i++) {
            System.out.print("#");
            System.out.print(a[i]);
            System.out.print("#");
            System.out.println("");
        }
        for (int i = 0; i < W+2; i++) {
            System.out.print("#");
        }
        System.out.println("");
    }
}