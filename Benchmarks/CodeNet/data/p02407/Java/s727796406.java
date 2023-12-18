import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

            in.readLine();
            List<String> arr = Arrays.stream(in.readLine().split(" "))
                    .collect(Collectors.toList());
            Collections.reverse(arr);

            System.out.println(String.join(" ", arr));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}

