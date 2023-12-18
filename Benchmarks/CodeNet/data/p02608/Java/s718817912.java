import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n + 1];
        int limit = (int)Math.sqrt(n);
        for (int x = 1; x <= limit; x++) {
            for (int y = 1; y <= limit; y++) {
                for (int z = 1; z <= limit; z++) {
                    if (x*x + y*y + z*z + x*y + y*z + x*z <= n)
                        array[x*x + y*y + z*z + x*y + y*z + x*z]++;
                    else
                        break;
                }    
            }
        }
        for (int i = 1; i <= n ; i++)
            System.out.println(array[i]);
    }
}