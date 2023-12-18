import java.util.*;

class Main {
    
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            int height = scan.nextInt();
            int width  = scan.nextInt();
            
            if (height == 0 && width == 0) {
                break;
            }
            
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
        }
    }
    
}