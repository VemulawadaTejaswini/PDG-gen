import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] task = {a, b, c};
        Arrays.sort(task);
 
        int result = (task[2]-task[1]) + (task[1]-task[0]);

        System.out.println(result);
    }
}
