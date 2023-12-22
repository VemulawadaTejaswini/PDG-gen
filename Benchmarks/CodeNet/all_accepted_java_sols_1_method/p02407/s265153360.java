import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int count = Integer.parseInt(br.readLine());
            String data[] = br.readLine().split(" ");
            for (int i = data.length - 1; i >= 0; i--)
                if (i == 0)
                    System.out.print(data[i]);
                else
                    System.out.printf("%s ", data[i]);
            System.out.print("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
