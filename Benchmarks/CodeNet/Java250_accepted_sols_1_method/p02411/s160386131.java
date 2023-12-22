import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input;
        int m, f, r, sum;
        char grade;

        while (true) {
            input = br.readLine().split(" ");
            m = Integer.parseInt(input[0]);
            f = Integer.parseInt(input[1]);
            r = Integer.parseInt(input[2]);
            sum = m + f;

            if (m == -1 && f == -1 && r == -1) {
                break;
            }

            if (m == -1 || f == -1 || sum < 30) {
                grade = 'F';
            } else if (sum >= 80) {
                grade = 'A';
            } else if (sum >= 65) {
                grade = 'B';
            } else if (sum >= 50 || (sum >= 30 && r >= 50)) {
                grade = 'C';
            } else {
                grade = 'D';
            }

            System.out.println(grade);
        }
    }
}