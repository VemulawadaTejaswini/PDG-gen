
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        try {
            while((input = reader.readLine()) != null){
                String[] inputArray = input.split(" ");
                int a = Integer.parseInt(inputArray[0]);
                int b = Integer.parseInt(inputArray[1]);
                int aa = a;
                int bb = b;
                if(bb>aa){
                    int tmp = aa;
                    aa = bb;
                    bb = tmp;
                }
                int mod = aa % bb;
                while(mod != 0){
                    aa = bb;
                    bb = mod;
                    mod = aa % bb;
                }
                System.out.println(bb+" "+(a/bb*b));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}