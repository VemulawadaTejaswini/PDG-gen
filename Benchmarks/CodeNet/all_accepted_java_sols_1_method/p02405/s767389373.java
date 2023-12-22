import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int H,W;
        while(true){
            H = input.nextInt();
            W = input.nextInt();
            if (H == 0 && W == 0){
                break;
            }
            for (int i = 0; i < H; i++){
                String tmp = (i%2 == 0) ? "#" : ".";
                for (int j = 0; j < W; j++){
                    System.out.printf("%s",tmp);
                    tmp = tmp.equals(".") ? "#" : ".";
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
    }
}
