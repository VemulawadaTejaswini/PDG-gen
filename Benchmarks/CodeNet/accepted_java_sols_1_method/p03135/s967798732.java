import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = reader.readLine().split(" ");
        double result = Double.parseDouble(input[0]) / Integer.parseInt(input[1]);
        System.out.println(result);
    }
}
