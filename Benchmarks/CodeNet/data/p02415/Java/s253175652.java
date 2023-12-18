import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // TODO 自動生成されたメソッド・スタブ
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        for (int i = 0; i < input.length(); i++) {
            char ans = input.charAt(i);
            if (Character.isUpperCase(ans)) {
                ans = Character.toLowerCase(ans);
            } else {
                ans = Character.toUpperCase(ans);
            }
            System.out.print(ans);
        }
        System.out.printf("\n");
    }

}

