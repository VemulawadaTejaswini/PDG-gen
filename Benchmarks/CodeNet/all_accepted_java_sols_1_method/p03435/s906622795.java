import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int grid[][] = new int[3][3];
        for(int i = 0; i < 3; i++ ){
            for(int j = 0; j < 3; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        
        String ans = "No";
        for(int i = 0; i <= grid[0][0]; i++ ){
            int a0 = i;
            int b0 = grid[0][0] - a0;
            int a1 = grid[1][0] - b0;
            int a2 = grid[2][0] - b0;
            
            boolean isOK = true;
            for(int y = 1; y <3; y++ ){
                int by1 = grid[0][y] - a0;
                int by2 = grid[1][y] - a1;
                int by3 = grid[2][y] - a2;
                
                if( by1 < 0 || by2 < 0 || by3 < 0 ) {
                    isOK = false;
                    break;
                }
                if( by1 != by2 || by2 != by3 ) {
                    isOK = false;
                    break;
                }
            }
            
            if( isOK ) {
                ans = "Yes";
                break;
            }
        }
        System.out.println( ans );
    }
}
