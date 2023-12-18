import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);

        List<String> mylist = new ArrayList<>();

        // 標準入力からの値を変数strinputに代入
        String strinput = reader.readLine();

        while (strinput != null) {

            mylist.add(strinput);
            strinput = reader.readLine();

        }
        String arr01[] = mylist.get(0).split(" ");

        int h = Integer.valueOf(arr01[0]);
        int w = Integer.valueOf(arr01[1]);

        //2次元配列を定義
        int arr_data[][] = new int[h + 2][w + 2];

        for (int i = 0; i < 2 + h; i++) {
            if (i == 0 || i == h + 1) {
                for (int j = 0; j < w + 2; j++) {
                    arr_data[i][j] = 0;
                }
            } else {

                String s = mylist.get(i);

                for (int j = 0; j < w; j++) {
                    String stemp = s.substring(j, j + 1);
                    if (stemp.equals("#")) {
                        arr_data[i][j + 1] = 1;
                    } else {
                        arr_data[i][j + 1] = 0;
                    }
                }
            }
        }

        for (int i = 1; i < h + 1; i++) {
            // System.out.println(Arrays.toString(arr_data[i]));
            for (int j = 1; j < w + 1; j++) {
                if (arr_data[i][j] == 1) {
                    System.out.print("#");
                } else {
                    //System.out.println(".");

                    int cnt = 0;
                    cnt += arr_data[i - 1][j - 1];
                    cnt += arr_data[i - 1][j];
                    cnt += arr_data[i - 1][j + 1];
                    cnt += arr_data[i][j - 1];
                    cnt += arr_data[i][j];
                    cnt += arr_data[i][j + 1];
                    cnt += arr_data[i + 1][j - 1];
                    cnt += arr_data[i + 1][j];
                    cnt += arr_data[i + 1][j + 1];
                    System.out.print(cnt);
                }

            }
            System.out.println();
        }
    }

}
