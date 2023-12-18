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
                
                int a = Integer.parseInt(input[0]);
                int b = Integer.parseInt(input[1]);
                int c = Integer.parseInt(input[2]);
                
                int count = 0;
                for(int i = a; i <= b; i++) {
                    if(c % i == 0) {
                        count++;
                    }
                }
                
                System.out.println(count);
                
                
            }
            stdReader.close();
        } catch(Exception e) {
            e.getStackTrace();
            System.exit(-1);
        }
    }
}