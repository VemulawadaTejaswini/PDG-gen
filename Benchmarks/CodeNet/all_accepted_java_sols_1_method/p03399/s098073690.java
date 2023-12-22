import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int planA = (a + c) < (a + d) ? (a + c) : (a + d);
        int planB = (b + c) < (b + d) ? (b + c) : (b + d);
        
        if (planA < planB) {
            System.out.println(planA);
        } else {
            System.out.println(planB);
        }
    }
}
