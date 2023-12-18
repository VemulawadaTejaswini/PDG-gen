import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(true) {
            int height = scan.nextInt();
            int width = scan.nextInt();

            if(height == 0 && width == 0){
                break;
            }

            StringBuilder sb = new StringBuilder(width);
            for(int i = 0; i < width; i++) {
                sb.append("#");
            }

            String line = sb.toString();
            for(int i = 0; i < height; i++) {
                System.out.println(line);
            }
            System.out.println("");
        }
    }
}

