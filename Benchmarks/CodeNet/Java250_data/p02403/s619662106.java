import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H,W;
        while(sc.hasNextLine()){
            String[] str = sc.nextLine().split(" ");
            H = Integer.parseInt(str[0]);
            W = Integer.parseInt(str[1]);
            if(H == 0 && W == 0) break;
            for(int y = 0; y < H; y++){
                for(int x = 0;x < W; x++){
                    System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}