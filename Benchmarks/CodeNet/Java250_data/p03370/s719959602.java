import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        String[] str = readLineStandardInput().split(" ");
        int N = Integer.parseInt(str[0]);
        int X = Integer.parseInt(str[1]);
        int[] m = new int[N];
        int sum_m = 0;
        int mim_m = Integer.MAX_VALUE;
        for(int i = 0; i < m.length; i++){
            String mem = readLineStandardInput();
            m[i] = Integer.parseInt(mem);
            sum_m += m[i];
            if(m[i] < mim_m){
                mim_m = m[i];
            }
        }
        int ret = X - sum_m;
        int num = N + ret / mim_m;
        System.out.println(num);
    }

    private static String readLineStandardInput() {
        String str;
        try {
            str = input.readLine();
        } catch(IOException e){
            str = null;
        }
        return str;
    }
}
