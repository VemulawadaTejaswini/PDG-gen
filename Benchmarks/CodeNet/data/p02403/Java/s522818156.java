import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int H, W;
        while(true){
            H = scan.nextInt();
            W = scan.nextInt();
            if(H == 0 && W == 0) break;
            drawRectangle(H, W);
            System.out.println();  
        }
    }
    public static void drawRectangle(int H, int W){
        for(int i = 0; i < H; i++){
            for(int k = 0; k < W; k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
