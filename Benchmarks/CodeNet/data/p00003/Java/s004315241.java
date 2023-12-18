
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0; i<n; i++) {
            int[] it = new int[3];
            it[0] = scanner.nextInt();
            it[1] = scanner.nextInt();
            it[2] = scanner.nextInt();
            Arrays.sort(it);
            if(it[0]*it[0] + it[1]*it[1] == it[2]*it[2]) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}