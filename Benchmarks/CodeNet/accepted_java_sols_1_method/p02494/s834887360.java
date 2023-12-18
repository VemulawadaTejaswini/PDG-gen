import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height;
        int width;
       
        while( true ) {
            height = scanner.nextInt();
            width = scanner.nextInt();
            if(height == 0 && width == 0) {
                break;
            }
            
            for(int i = 0; i < height; i++) {
                for(int j = 0; j < width; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }
}