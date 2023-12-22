
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args ) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();        
        String str = "#";
        
        while(true){
            String data = reader.readLine();
            String[] number = data.split(" ");
            int y = Integer.parseInt(number[0]);
            int x = Integer.parseInt(number[1]);
            if (x == 0 && y == 0 ) {
                break;
            }
            for ( int c = 0; c < y ; c++) {
                builder
                   .append(StringUtilsRepeat(str,x))
                   .append("\n");
            }
            builder.append("\n");
                   
        }
        System.out.print(builder);
        
    }
    public static StringBuilder StringUtilsRepeat(String str,int x) {
        StringBuilder line = new StringBuilder();
        
        for ( int i = 0; i < x ; i++) {
            line.append(str);
        }
        return line;
    }
}