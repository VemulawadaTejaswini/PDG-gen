import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input_data;
        char arr[];
        try {
            input_data = br.readLine();
            arr = input_data.toCharArray();

            for (int i = 0; i < arr.length; i++) {
                // 대문자
                if (65 <= arr[i] && arr[i] <= 90) {
                    arr[i] = (char) (arr[i] + 32);
                    continue;
                }
                // 소문자
                if (97 <= arr[i] && arr[i] <= 122) {
                    arr[i] = (char) (arr[i] - 32);
                    continue;
                }
            }
            System.out.println(arr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
