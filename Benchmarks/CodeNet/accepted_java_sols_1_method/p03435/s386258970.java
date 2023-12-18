import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        
        int old = 5000;
        int a = array[0][0];
        int b = array[0][1];
        int c = array[0][2];
        for (int i = 0; i < 2; i++) {
            int d = array[i+1][0] - a;
            int e = array[i+1][1] - b;
            int f = array[i+1][2] - c;
            
            if (d == e && e == f) {
                if (i == 1) {
                    System.out.println("Yes");
                    return;
                }
            } else {
                System.out.println("No");
                return;
            }
        }
    }
}
