import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<String> grade = new ArrayList<String>();
            BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while(true) {
                line = stdReader.readLine();
                String[] input = line.split(" ");
                int[] data = new int[3];
                data[0] = Integer.parseInt(input[0]);
                data[1] = Integer.parseInt(input[1]);
                data[2] = Integer.parseInt(input[2]);
                if (data[0] == -1 && data[1] == -1 && data[2] == -1) {
                    break;
                }
                int totle = data[0] + data[1];
                if (data[0] == -1 || data[1] == -1) {
                    grade.add("F");
                } else if (80 <= totle) {
                    grade.add("A");
                } else if (65 <= totle && totle < 80) {
                    grade.add("B");
                } else if (50 <= totle && totle < 65) {
                    grade.add("C");
                } else if (30 <= totle && totle < 50) {
                    if (50 <= data[2]) {
                        grade.add("C");
                    } else {
                        grade.add("D");
                    }
                } else if (totle < 30) {
                    grade.add("F");
                }
            }
            for (int i = 0; i < grade.size(); i++) {
                System.out.println(grade.get(i));
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
            e.getStackTrace();
            System.exit(-1);
        }
    }
}