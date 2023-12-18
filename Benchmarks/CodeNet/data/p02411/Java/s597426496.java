import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int m;
        int mTotal = 50;
        int f;
        int fTotal = 50;
        int r;
        int rTotal = 100;


        boolean keepGoing = true;

        while(keepGoing){
            m = inp.nextInt();
            f = inp.nextInt();
            r = inp.nextInt();

            if (m == -1 && f == -1 && r == -1) {
                keepGoing = false;
            } else {
                System.out.println(grade(m, f, mTotal, fTotal));
            }
        }
    }

    public static String grade(int m, int f, int mTotal, int fTotal) {
        if (m == -1 || f == -1) {
            return "F";
        }

        double mf = m+f;
        double mfTotal = mTotal + fTotal;
        double grade = (mf/mfTotal)*100;

        if (grade >= 80) {
            return "A";
        } else if (grade >= 65) {
            return "B";
        } else if (grade >= 50) {
            return "C";
        } else if (grade >= 30) {
            return "D";
        } else {
            return "F";
        }
    }
}

