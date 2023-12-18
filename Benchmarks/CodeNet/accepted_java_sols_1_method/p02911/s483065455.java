import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int basePoint = sc.nextInt();
        int answerCount = sc.nextInt();
        int eachPoint[] = new int[count];
        for (int i = 0; i < eachPoint.length; i++) {
            eachPoint[i] = basePoint - answerCount;
        }
        
        for (int i = 0; i < answerCount; i++) {
            int answerPerson = sc.nextInt() - 1;
            eachPoint[answerPerson]++;
        }
        sc.close();

        for (int point : eachPoint) {
            if (point > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}