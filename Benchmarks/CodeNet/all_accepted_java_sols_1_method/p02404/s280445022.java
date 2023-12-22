import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            if (h == 0 && w == 0) {
                break;
            }
            for(int row = 0; row < h; row++){
                for(int col = 0; col < w; col++){
                    if(row == 0 || row == h-1 || col == 0 || col == w-1){
                        System.out.print("#");
                    }else{
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        scanner.close();
    }
}

