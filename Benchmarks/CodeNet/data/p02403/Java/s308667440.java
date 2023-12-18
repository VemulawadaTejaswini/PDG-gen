import java.util.Scanner;
class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
         
        while(true){
            //??\???
            int H = scan.nextInt();
            int W = scan.nextInt();
            //??????
            if(W == 0 || H == 0)break;
             
            for (int i = 0; i < W; i++) {
                for (int j = 0; j < H; j++) {
                    //??????
                    System.out.print("#");
                }
                System.out.println(" ");
            }
        }
    }
}