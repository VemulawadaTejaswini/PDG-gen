import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int H = 0;
        int W = 0;

        while((H = num.nextInt()) != 0 && (W = num.nextInt()) != 0){
            for(int i = 0; i < H; i++) {
                for(int j = 0; j < W; j++) {
                    if(i != 0 && i != H - 1 && j != 0 && j != W - 1) {
                        System.out.print(".");
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}
