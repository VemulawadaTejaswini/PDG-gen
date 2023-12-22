import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int x = Integer.parseInt(line[1]);
            int num = 0;
            
            if(n == 0 && x == 0) { break; }
            
            for (int a = 1; a <= n; a++){
                for (int b = 2; b <= n; b++){
                    for(int c = 3; c <= n; c++){
                        if( a+b+c == x && a < b && b < c ) {
                            num += 1;
                        }
                    }
                }           
            }
            
            System.out.println(num);
            
        }
            
                
    }


}