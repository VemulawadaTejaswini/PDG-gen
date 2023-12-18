import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        ArrayList<Integer> num = new ArrayList<>();
        int x = 0;
        int a = 1;
        int data;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {

            data = Integer.parseInt(br.readLine());
            if (data == 0) {
                break;
            }
            num.add(data);

        } while (data != 0);

        
        for (int i = 0; i < num.size(); i++) {
            System.out.println("Case " + a + ": " + num.get(i));
            a++;
        }
    }

}