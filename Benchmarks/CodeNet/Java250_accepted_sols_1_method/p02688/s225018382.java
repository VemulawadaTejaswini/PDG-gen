import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());
        Integer k = Integer.parseInt(scanner.next());
        Integer da[][] = new Integer[k][];
        Boolean[] total = new Boolean[n];

        for(int i= 0; i < n; i++) {
            total[i] = false;
        }

        for(int i = 0; i < k; i++) {
            int tmp = Integer.parseInt(scanner.next());
            ArrayList list = new ArrayList();
            for(int j = 0; j < tmp; j++) {
               list.add(Integer.parseInt(scanner.next()));
            }
            da[i] = (Integer[])list.toArray(new Integer[tmp]);
        }

        for(int i = 0; i < da.length; i++) {
            for(int j = 0; j < da[i].length; j++) {
                total[da[i][j] -1] = true;
            }
        }
        int count = 0;
        for(int i =0; i < total.length; i++){
            if(total[i] == false) count++;
        }

        System.out.println(count);
    }
}
