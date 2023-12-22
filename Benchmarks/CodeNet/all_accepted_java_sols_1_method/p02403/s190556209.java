import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            short h = scanner.nextShort();
            short w = scanner.nextShort();
            
            if (h == 0 && w == 0) { 
                break;
            }
            
            for(short i=0; i<h; i++) {
                for(short j=0; j<w; j++) {
                    sb.append("#");
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        
        System.out.print(sb);
    }
    
}
