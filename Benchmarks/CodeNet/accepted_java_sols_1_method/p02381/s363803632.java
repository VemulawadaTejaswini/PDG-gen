
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//0入力するまで続けて、標準偏差を出力する
public class Main {

    public static void main(String[] args) throws IOException {
        // TODO 自動生成されたメソッド・スタブ
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while (!((line = br.readLine()).equals("0"))) {
            int students = Integer.parseInt(line);
            String[] inputScore = br.readLine().split(" ");
            int[] data = new int[students];
            double sum = 0;
            double average = 0;
            double squaresum = 0;

            for (int i = 0; i < students; i++) {
                sum += Integer.parseInt(inputScore[i]);
//                System.out.println(Integer.parseInt(inputScore[i]));
//                System.out.println(sum);
            }
            average = sum / students;

            for (int i = 0; i < students; i++) {
                squaresum += Math.pow(Integer.parseInt(inputScore[i]) - average, 2);
            }

            double varience = squaresum / students;
            System.out.println(Math.sqrt(varience));
        }

    }

}
