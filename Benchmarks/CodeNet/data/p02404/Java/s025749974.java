import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(true) {
            int height = scan.nextInt();
            int width = scan.nextInt();

            if(height == 0 && width == 0) {
                break;
            }
 
            for(int i = 0; i < height; i++) {
                for(int j = 0; j < width; j++) {
                    if((0 < i && i < height - 1) && (0 < j && j < width - 1)) {
                        System.out.print(".");
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.println("");
            }

            System.out.println("");
        }
    }
}

