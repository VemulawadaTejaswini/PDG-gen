import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0; i<n; i++) {
            int[] ia = new int[3];
            ia[0] = scanner.nextInt();
            ia[1] = scanner.nextInt();
            ia[2] = scanner.nextInt();
            Arrays.sort(ia);
            if(ia[0]*ia[0] + ia[1]*ia[1] == ia[2]*ia[2]) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}