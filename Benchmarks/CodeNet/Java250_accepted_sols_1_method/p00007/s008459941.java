import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        try {
            input = reader.readLine();
            int n = Integer.parseInt(input);
            int money = 100000;
            for(int i=0; i<n; i++){
                money = (int)Math.ceil((money * 1.05)/1000)*1000;
            }
            System.out.println(money);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}