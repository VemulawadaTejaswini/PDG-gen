import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        while(true){
            int h = scan.nextInt();
            int w = scan.nextInt();
            if(h == 0 && w == 0) break;
            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++){
                    System.out.printf("#");
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
        scan.close();
    }
}
