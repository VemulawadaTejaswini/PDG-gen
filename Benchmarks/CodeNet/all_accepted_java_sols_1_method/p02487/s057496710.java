import java.util.Scanner;
import java.util.Arrays; 

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();

        while(h != 0 && w != 0){
            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++){
                    if(i == 0 || i == h - 1 || j == 0 || j == w - 1){
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            System.out.println();

            h = scan.nextInt();
            w = scan.nextInt();
        }
    }
}