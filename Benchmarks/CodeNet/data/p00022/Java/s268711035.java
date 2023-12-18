import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            ArrayList<Integer> sumList;
            int tmp;
            while (true) {
                int n = Integer.parseInt(br.readLine());
                if (n == 0) {
                    System.exit(0);
                }
                tmp = 0;
                sumList = new ArrayList<>();
                sumList.add(0);
                for (int i = 0; i < n; i++) {
                    tmp += Integer.parseInt(br.readLine());
                    sumList.add(tmp);
                }

                int sum;
                int max = 0;
                for (int i = 0; i < sumList.size() - 1; i++) {
                    for (int j = i + 1; j < sumList.size() ; j++) {
                        sum = sumList.get(j) - sumList.get(i);
                        max = sum > max ? sum : max;
                    }
                }
                System.out.println(max);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}