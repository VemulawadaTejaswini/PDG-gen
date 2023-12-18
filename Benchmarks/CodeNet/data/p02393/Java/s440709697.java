import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x = new int[3];
        for(int i = 0; i < 3; i++){
            x[i] = scanner.nextInt();
        }
        Arrays.sort(x);
       System.out.print(x[0]+" "+x[1]+" "+x[2]);
    }
}
