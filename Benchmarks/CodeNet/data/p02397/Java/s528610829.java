
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        int i = 1; 
        while(true) {
            String data = reader.readLine();
            String[] number = data.split(" ", 0);
            if(Integer.parseInt(number[0])== 0 && Integer.parseInt(number[1])== 0 )
                break;
            int[] numbers = sort (number);
            builder
                    .append(Integer.toString(numbers[0]))
                    .append(" ")
                    .append(Integer.toString(numbers[1]))
                    .append("\n");
        }        
        System.out.print(builder);
    }
    public static int[] sort ( String[] number) {
        int[] numbers = new int[2];
        Arrays.fill(numbers,0);
        numbers[0] = Integer.parseInt(number[0]);
        numbers[1] = Integer.parseInt(number[1]);
        if (numbers[0] > numbers[1]) {
            int w  = numbers[0];
            numbers[0] = numbers[1];
            numbers[1] = w;
        }
        return numbers;
    }
}