import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] top3 = new int[3];
        String line;
        try {
            while((line = br.readLine()) != null){
                String[] numbers = line.trim().split(" ");
                int a = Integer.parseInt(numbers[0]);
                int b = Integer.parseInt(numbers[1]);
                System.out.println(Integer.toString(a+b).length());
            }
        } catch (IOException e) {
        }
    }
}