import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        boolean keepGoing = true;

        while(keepGoing){
            int m = inp.nextInt();
            int  f = inp.nextInt();
            int r = inp.nextInt();

            int mTotal = 50;
            int fTotal = 50;
            int rTotal = 100;

            if (m == -1 && f == -1 && r == -1) {
                keepGoing = false;
            } else {
                System.out.println(grade(m, f, r, mTotal, fTotal, rTotal));
            }
        }
    }

    public static String grade(int m, int f, int r, int mTotal, int fTotal, int rTotal) {
        if (m == -1 || f == -1) {
            if (r == -1) {
                return "F";   
            }
        }

        double mf = m+f;
        double mfTotal = mTotal + fTotal;
        double grade = (mf/mfTotal)*100;

        double makeUp;

        if (r != -1) {
            makeUp = (r/rTotal)*100;
        } else {
            makeUp = -1;
        }

        double check = grade;

        if (r > grade) {
            check = r;
        }

        if (check >= 80) {
            return "A";
        } else if (check >= 65) {
            return "B";
        } else if (check >= 50) {
            return "C";
        } else if (check >= 30) {
            return "D";
        } else {
            return "F";
        }
    }
}

