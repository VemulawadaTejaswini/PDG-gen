import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.lines()
                .map(line -> Arrays.stream(line.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray())
                .forEach(tokens -> {
                    int a = tokens[0];
                    int b = tokens[1];
                	if(((a%3==0)||(b%3==0))||((a+b)%3==0))System.out.println("Possible");
                	else System.out.println("Impossible");
                });
        }
    }
}