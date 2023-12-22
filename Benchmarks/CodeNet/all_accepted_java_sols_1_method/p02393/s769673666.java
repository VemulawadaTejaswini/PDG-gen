import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        String s;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            s = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .sorted()
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(" "));
        }

        System.out.println(s);
    }

}

