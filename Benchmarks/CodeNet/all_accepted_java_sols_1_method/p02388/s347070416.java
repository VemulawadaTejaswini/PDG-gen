import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    static final String PROBREM="ITP1 1 A";
    
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = reader.readLine();
        
        Integer input = Integer.parseInt(inputLine);
        Integer cubic = input*input*input;
        
        System.out.println(cubic);
    }
    
}

