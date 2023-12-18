import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // 入力受取
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line1 = input.readLine();

        int r = Integer.parseInt(line1);

        System.out.println(3*(r*r));
    }
}
