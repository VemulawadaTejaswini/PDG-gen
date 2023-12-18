import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int m = 0, f = 0, r = 0;
        String grade = "";

        while(true){
            m = num.nextInt();
            f = num.nextInt();
            r = num.nextInt();

            if(m == -1 && f == -1 && r == -1) {
                break;
            }else if(m == -1 || f == -1 || m + f < 30) {
                grade = "F";
            } else if(m + f >= 80) {
                grade = "A";
            } else if(m + f >= 65) {
                grade = "B";
            } else if(m + f >= 50) {
                grade = "C";
            } else if(m + f >= 30) {
                if(r >= 50) {
                    grade = "C";
                } else {
                    grade = "D";
                }
            }
            System.out.println(grade);
        }
    }
}
