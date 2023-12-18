import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int price = Integer.parseInt(reader.readLine());
            reader.close();
            int num1000 = price / 1000; // 必要な1000円の枚数-1
            if (price % 1000 == 0) {
                // 価格が1000円で割り切れるときはお釣り０
                System.out.println("0");
            } else {
                System.out.println(1000 * (num1000 + 1) - price);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}