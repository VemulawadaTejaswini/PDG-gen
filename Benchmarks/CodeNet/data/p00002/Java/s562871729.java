import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            try{
            String[] line = br.readLine().split(" ");
            int length = String.valueOf(Integer.parseInt(line[0]) + Integer.parseInt(line[1])).length(); 
            System.out.println(length);
            }catch(NullPointerException e) {
                break;
            }
        }
    }
}