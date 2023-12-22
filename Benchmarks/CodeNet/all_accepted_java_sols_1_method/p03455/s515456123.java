import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = reader.readLine().split(" ");
        if(Integer.parseInt(inputs[0]) * Integer.parseInt(inputs[1]) % 2 == 0)
            System.out.print("Even");
        else
            System.out.print("Odd");
    }
}