import java.util.*;

public class Main {
    public static void main(String[] args) {
        int H, W;
        Scanner num = new Scanner(System.in);
        while((H = num.nextInt()) != 0 && (W = num.nextInt()) != 0) {
            
            for(int i = 0; i < H; i++) {
                for(int j = 0; j < W; j++) {
                    if(i % 2 == 0) {
                        if(j % 2 == 0) {
                            System.out.print("#");
                        } else {
                            System.out.print(".");
                        }
                    } else {
                        if(j % 2 == 0) {
                            System.out.print(".");
                        } else {
                            System.out.print("#");
                        }
                    }
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}
