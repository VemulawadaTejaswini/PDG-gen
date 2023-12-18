
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class StudentResult {

    int middle_point; // 中間試験の点数
    int final_point; // 期末試験
    int retest_point; // 再試験

    public StudentResult(int middle_point, int final_point, int retest_point) {
        this.middle_point = middle_point;
        this.final_point = final_point;
        this.retest_point = retest_point;
    }

    public int getFinal_point() {
        return final_point;
    }

    public int getMiddle_point() {
        return middle_point;
    }

    public int getRetest_point() {
        return retest_point;
    }

    public void setFinal_point(int final_point) {
        this.final_point = final_point;
    }

    public void setMiddle_point(int middle_point) {
        this.middle_point = middle_point;
    }

    public void setRetest_point(int retest_point) {
        this.retest_point = retest_point;
    }

}

/**
 *
 * @author k16069kk
 */
public class Main {

    public static String result(int mid, int fin, int re) {
        if (!(mid == -1 && fin == -1 && re == -1)) {
            if (mid == -1 || fin == -1) {
                return "F";
            }

            if (mid + fin >= 80) {
                return "A";
            }

            if (mid + fin >= 65 && mid + fin < 80) {
                return "B";
            }

            if ((mid + fin >= 50 && mid + fin < 65)
                    || ((mid + fin >= 30 && mid + fin < 50) && re >= 50)) {
                return "C";
            }

            if (mid + fin >= 30 && mid + fin < 50) {
                return "D";
            }

            if (mid + fin < 30) {
                return "F";
            }
        }
        return "-1";
    }

    public static void print(String res) {
        switch (res) {
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
            case "C":
                System.out.println("C");
                break;
            case "D":
                System.out.println("D");
                break;
            case "F":
                System.out.println("F");
                break;
            case "-1":
                break;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int index = 0;
        List<StudentResult> list = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            java.util.StringTokenizer st = new StringTokenizer(line, " ");
            while (st.hasMoreTokens()) {
                int m = Integer.parseInt(st.nextToken());
                int f = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                StudentResult sr = new StudentResult(m, f, r);
                list.add(sr);
            }
            if (list.get(index).getFinal_point() == -1
                    && list.get(index).getMiddle_point() == -1
                    && list.get(index).getRetest_point() == -1) {
                break;
            }
            index++;
        }

        for (StudentResult list1 : list) {
            print(result(list1.getMiddle_point(),
                            list1.getFinal_point(),
                            list1.getRetest_point()));
        }

    }

}

