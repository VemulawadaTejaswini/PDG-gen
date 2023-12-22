
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        long prev = 0;
        int moves = 0;
        int maxMoves = 0;
        
        for (int i = 0; i < n; i ++) {
            long in = s.nextLong();
            if (in <= prev)
                moves ++;
            else {
                if (moves > maxMoves)
                    maxMoves = moves;
                moves = 0;
            }
            prev = in;
        }
        
        System.out.println(Math.max(moves, maxMoves));
    }
    
}
