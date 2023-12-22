import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String []N = line.split("");
        int count = 0; 
        for(int i = 0; i < 3; i++){
            if(N[i].equals("1")){
                count++;
            }
        }
        System.out.println(count);
    }
}
