import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
            
            String line;
            
            while((line = stdReader.readLine()) != null) {
                String[] input = line.split(" ", 0);
                int n = Integer.parseInt(input[0]); 
                int x = Integer.parseInt(input[1]);
                
                if(n == 0  && x == 0) {
                    break;
                }
                
                int count = 0;
                
                for(int i = 1; i <= (n - 2); i++) {
                    if(i > (x - 2)) {
                        break;
                    }
                    for(int j = (i + 1); j <= (n - 1); j++) {
                        if(i + j > x - 1) {
                            continue;
                        }
                        for(int k = (j + 1); k <= n; k++) {
                            int sum = i + j + k;
                            if(sum == x) {
                                count++;
                            }
                        }
                    }
                }
                
                System.out.println(count);
            }
            stdReader.close();
        } catch(Exception e) {
            System.out.println(e);
            e.getStackTrace();
            System.exit(-1);
        }
    }
}