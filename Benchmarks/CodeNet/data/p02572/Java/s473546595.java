import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int num = Integer.parseInt(line);
        line = sc.nextLine();
        String[] lines = line.split(" ", 0);
        long[] array = new long[num];
        long ret = 0;

        for (int i = 0; i < num; i++) {
            array[i] = Long.parseLong(lines[i]);
        }

        
        long[] array2 = new long[num];
        long sum  =0;
        for (int i = 1; i < num; i++) {
            sum += array[i];
        }
        array2[0] = sum;
        for (int i = 1; i < num ; i++){
            array2[i] = array2[i - 1] - array[i];
        }
        
        for (int i = 0; i < num; i++) {
            ret += (array[i] * array2[i]);
            if (ret >= 1000000007) {
                ret = ret % 1000000007;
            }
        }

        System.out.println(ret);
    }

}