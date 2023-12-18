import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] group = {0, 1, 3, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1};
        if(group[sc.nextInt()] == group[sc.nextInt()]){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
