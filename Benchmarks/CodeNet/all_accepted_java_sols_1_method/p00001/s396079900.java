import java.util.*;

public class Main {
    public static void main(String[] a) {
        // Your code here!
        Scanner sc = new Scanner(System.in);

        int[] mountainsHight = new int[10];

        for(int i = 0; i < 10; i++){
          mountainsHight[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(mountainsHight);

        for(int i = 9; i > 6; i--) {
          System.out.println (mountainsHight[i]);
        }
    }
}

