import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height;
        int width;
        int counter = 0;
       
        while( true ) {
            height = scanner.nextInt();
            width = scanner.nextInt();
            couter = 0;
            if(height == 0 && width == 0) {
                break;
            }
            
            for(int i = 0; i < height; i++) {
                for(int j = 0; j < width; j++) {
                    if(counter%2 == 0) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                    counter++;
                }
                System.out.println();
                counter++;
            }
            System.out.println();
        }
        
    }
}