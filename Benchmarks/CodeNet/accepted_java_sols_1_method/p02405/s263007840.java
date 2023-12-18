
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int height = input.nextInt();
            int width = input.nextInt();
            if(width == 0 || height == 0) break;
            for(int i = 0; i < height;i++){
                for(int j = 0; j < width; j++){
                    if(i % 2 == 0){
                        if(j % 2 == 0){
                            System.out.print("#");
                        } else {
                            System.out.print(".");
                        }
                    } else {
                        if(j % 2 == 1){
                            System.out.print("#");
                        } else {
                            System.out.print(".");
                        }
                    }
                }
                System.out.println("");
            }
System.out.println("");
        }
    }
}
