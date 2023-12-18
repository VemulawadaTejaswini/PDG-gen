import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int H, W;
        while(true){
            H = scan.nextInt();
            W = scan.nextInt();
            if(H == 0 && W == 0) break;
            drawChessboard(H, W);
            System.out.println();
        }
    }
    public static void drawChessboard(int H, int W){
        for(int i = 0; i < H; i++){
            for(int k = 0; k < W; k++){
                if((i + k) % 2 == 0){
                    System.out.print("#");
                }else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}

