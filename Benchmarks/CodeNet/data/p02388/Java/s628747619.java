import java.io.*;
public class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String line;
            int number = 0;

            line = reader.readLine();
            number = Integer.parseInt(line);
            
            System.out.println(number * number *number);
        
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
