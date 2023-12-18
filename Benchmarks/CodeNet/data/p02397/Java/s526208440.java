import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            
            boolean flag = true;
            while (flag) {
                
                String[] line = reader.readLine().split(" ");
                int x = Integer.parseInt(line[0]);
                int y = Integer.parseInt(line[1]);
                final int END = 0;
                
                if (x == END && y == END) {
                    flag = false;
                } else {
                    int big   = Math.max(x, y);
                    int small = Math.min(x, y);
                    System.out.println(small + " " + big);
                }
                
            }
            
        } catch (NumberFormatException e) {
            
            e.printStackTrace();
            
        } catch (IOException e) {

            e.printStackTrace();

        }
        
    }
    
}