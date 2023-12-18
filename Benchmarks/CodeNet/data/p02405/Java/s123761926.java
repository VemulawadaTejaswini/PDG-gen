import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            int H = scanner.nextInt();
            int W = scanner.nextInt();
            
            if (H==0 && W==0) { break; }
            
            String[] mark = {"#", "."};
            int idx = 0;
            
            for (int i=0; i<H; i++) {
                for (int j=0; j<W; j++) {
                    idx = (i+j) % 2;
                    sb.append(mark[idx]);
                }
                sb.append("\n");
            }
            sb.append("\n");
            
        }
        
        System.out.print(sb.toString());
    }
}
