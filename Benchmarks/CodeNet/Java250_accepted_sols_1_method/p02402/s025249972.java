import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
            
            String line;
            int count = 0;
            int n = 0;
            while((line = stdReader.readLine()) != null) {
                // ?????????????????°???????????????
                if(count == 0) {
                    n = Integer.parseInt(line);
                    count++;
                    continue;
                }
                
                String[] input = line.split(" ", 0);
                
                int min = 1000000;
                int max = -1000000;
                long sum = 0;
                for(int i = 0; i < n; i++) {
                    int x = Integer.parseInt(input[i]);
                    // ????°????
                    if(x < min) {
                        min = x;
                    }
                    // ?????§???
                    if(x > max) {
                        max = x;
                    }
                    // ????¨?
                    sum += Long.parseLong(input[i]);
                }
                
                System.out.println(min + " " + max + " " + sum);
                
            }
            stdReader.close();
        } catch(Exception e) {
            e.getStackTrace();
            System.exit(-1);
        }
    }
}