import java.util.Scanner;

public class Main{
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        while(!(H == 0 && W == 0)){
            for(int i = 0; i < H; i++){
                for(int j = 0; j < W; j++){
                    if((i + j) % 2 == 0)
                        System.out.print("#");
                    else
                        System.out.print(".");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
            H = scanner.nextInt();
            W = scanner.nextInt();
        }
    }
}

