import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> grade = new ArrayList<String>();
        while (true) {
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            if (m == -1 & f == -1 & r == -1) {
                for (int i=0; i<grade.size();i++)
                    System.out.println(grade.get(i));
                break;
            }
            if (m == -1 | f == -1)
                grade.add("F");
            else {
                if (m + f >= 80)
                    grade.add("A");
                else if (m + f >= 65)
                    grade.add("B");
                else if (m + f >= 50)
                    grade.add("C");
                else if (m + f >= 30) {
                    if (r >= 50)
                        grade.add("C");
                    else
                        grade.add("D");
                }
                else if (m + f < 30)
                    grade.add("F");
            }
        }
    }
}
