import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        
        String[] line = new String[H];

        for(int i = 0; i < H; i++) {
            line[i] = sc.next();
        }
        
        for(int i = 0; i < H; i++) {
            System.out.println(line[i]);

            System.out.println(line[i]);
        }
    }
}