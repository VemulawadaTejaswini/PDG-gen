import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int H, W;
        while(true){
            H = scan.nextInt();
            W = scan.nextInt();
            if(H == 0 && W == 0) break;
            drawFrame(H, W);
            System.out.println();
        }
    }
    public static void drawFrame(int H, int W){
        for(int i = 0; i < H; i++){
            for(int k = 0; k < W; k++){
                if(i == 0 || i == H - 1 || k == 0 || k == W - 1){
                    System.out.print("#");
                }else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
