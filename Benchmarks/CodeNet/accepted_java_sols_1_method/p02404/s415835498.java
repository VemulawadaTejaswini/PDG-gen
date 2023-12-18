import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
            
            String line;
            
            while((line = stdReader.readLine()) != null) {
                String[] input = line.split(" ", 0);
                int h = Integer.parseInt(input[0]);
                int w = Integer.parseInt(input[1]);
                
                if(h == 0 && w == 0) {
                    break;
                }
                for(int i = 0; i < h; i++) {
                    for(int j = 0; j < w; j++) {
                        // ??????????????¨????????????????????????#
                        if(i == 0 || i == (h - 1)) {
                            System.out.print("#");
                        } else if(j == 0 || j == (w - 1)) {
                            System.out.print("#");
                        } else {
                            System.out.print(".");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }
            stdReader.close();
        } catch(Exception e) {
            e.getStackTrace();
            System.exit(-1);
        }
    }
}