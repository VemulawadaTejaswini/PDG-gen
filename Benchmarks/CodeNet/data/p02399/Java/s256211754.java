import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        int a, b, division, remainder;
        String f;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder createString = new StringBuilder();
        String line = br.readLine();
        String[] numbers = line.split(" ");
        a = Integer.parseInt(numbers[0]);
        b = Integer.parseInt(numbers[1]);
        division = a / b;
        remainder = a % b;
        f = (String.format("%.5f",((double)a / (double)b)));
        
        createString
            .append(division)
            .append(" ")
            .append(remainder)
            .append(" ")
            .append(f)
            .append("\n");
        System.out.print(createString);
    }
}
