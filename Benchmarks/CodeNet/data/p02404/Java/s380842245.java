
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args ) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        
        while(true) {
            String line = reader.readLine();
            String[] column = line.split(" ");
            int y = Integer.parseInt(column[0]);
            int x = Integer.parseInt(column[1]);
            
            if ( y == 0 && x == 0 ) {
                break;
            }
            builder.append(StringUtilsRepeat(x,y));
        }
        System.out.print(builder);
    }
    public static StringBuilder StringUtilsRepeat(int x,int y) {
        StringBuilder line = new StringBuilder();
        String str = "#";
        String strin = ".";
        for ( int j = 1; j <= y; j++ ){
             for ( int i = 1; i <= x ; i++ ) {
                 if (j == 1 || j == y)
                     line.append(str);
                 else if (i == 1 || i == x)
                     line.append(str);
                 else
                     line.append(strin);
             }
             line.append("\n");
        }
        line.append("\n");
        return line;
    }
}