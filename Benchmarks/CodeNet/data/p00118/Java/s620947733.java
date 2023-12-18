import java.util.*;

public class Main {

    static char[][] field;
    static int h, w;
    
    static void Erase(int i, int j) {
        char nowchar = field[i][j];
        field[i][j] = 'x'; 

        if ( i < h - 1 && field[i+1][j] == nowchar ) Erase(i+1, j); 
        if ( i > 0 && field[i-1][j] == nowchar ) Erase(i-1, j);
        if ( j < w - 1 && field[i][j+1] == nowchar ) Erase(i, j+1);
        if ( j > 0 && field[i][j-1] == nowchar ) Erase(i, j-1);
        
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            h = sc.nextInt();
            w = sc.nextInt();

            if (h == 0 && w == 0)   break;

            field = new char[h][w];

            for(int i = 0; i < h; i++) {
                field[i] = sc.next().toCharArray();
            } 

            int result = 0;
            
            for(int i = 0; i < h; i++) {
                for(int j = 0; j < w; j++) {
                    if (field[i][j] != 'x') {
                        Erase(i, j);
                        result += 1;
                    }
                }
            }

            System.out.println(result);
                    
        }
    }
}