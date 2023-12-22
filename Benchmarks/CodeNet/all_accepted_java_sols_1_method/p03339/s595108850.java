import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());

        String S = scan.next();

        int count1 = 0;
        int count2 = 0;

        int[] countW = new int[S.length()];
        Arrays.fill(countW, 0);
        int[] countE = new int[S.length()];
        Arrays.fill(countE, 0);

        int i = 0;
        int j = S.length()-1;

        while(i <= S.length()-1 && 0 <= j){

            if( (0 <= i-1) && S.substring(i-1, i-1+1).equals("W")) count1++;

            countW[i] += count1;

            if( (j+1 <= S.length()-1) && S.substring(j+1, j+1+1).equals("E")) count2++;

            countE[j] += count2;

            i++;
            j--;
        }

        int min = 1111111111;
        int[] sum = new int[S.length()];
        for(int k = 0; k < S.length(); k++){
            //System.out.println(k +"番目の左側のWの数"+countW[k]);
            //System.out.println(k +"番目の右側のEの数"+countE[k]);
            sum[k] = countW[k] + countE[k];
            //System.out.println(sum[k]);
            if(sum[k] < min) min = sum[k];
        }
        
        System.out.println(min);
    }
}