import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num1 = br.readLine();
        int count = 0;
        String[] temp = num1.split("");

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < temp.length ;i++) {
            list.add(Integer.parseInt(temp[i]));
        }

        for (int i = 0; i < list.size(); i++) {
            int temp1 = list.get(i);
            int temp2 = list.get(list.size() - (i + 1));

            if (temp1 == temp2) {
                count++;
            }
        }

        if (count == temp.length) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}
