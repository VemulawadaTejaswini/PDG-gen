import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(System.in));
        String std = stdInput.readLine();
        String[] input = std.split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        
        int count = 0;
        
        for(int i = a; i < (b+1); i++){
            if(c % i == 0){
                count++;
            }
        }
        
        System.out.println(count);
    }
}