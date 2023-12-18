import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int height = sc.nextInt();
            int width = sc.nextInt();
            if (height == 0 && width == 0) break;
            for(int i = 1; i <= height; i++) {
                for(int j = 1; j <= width; j++) {
                    if(i == 1 || j == 1 || i == height || j == width) System.out.print("#");
                    else System.out.print(".");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}