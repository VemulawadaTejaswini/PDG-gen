import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        int[] count = new int[4];
        for(int i = 0 ; i <= 2 ; i++) {
            String[] strs = stdR.readLine().split(" ");
            count[Integer.parseInt(strs[0]) - 1]++;
            count[Integer.parseInt(strs[1]) - 1]++;   
        }
        Arrays.sort(count);
        if(count[0] == 1 && count[1] == 1 && count[2] == 2 && count[3] == 2) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
