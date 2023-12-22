import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    // 標準入力
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 標準入力数値配列用
    static int[] inputval() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        int[] intarray = new int[strarray.length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = Integer.parseInt(strarray[i]);
        }
        return intarray;
    }

    public static void main(String[] args) throws Exception {
	// write your code here
        int a = Integer.parseInt(br.readLine().trim());
        int b = Integer.parseInt(br.readLine().trim());
        int c = Integer.parseInt(br.readLine().trim());
        int x = Integer.parseInt(br.readLine().trim());
        int cnt = 0;
        for (int i=0; i<=a; i++){
            for (int j=0; j<=b; j++){
                for (int k=0; k<=c; k++){
                    if (500 * i + 100 * j + 50 * k == x){
                        cnt+=1;
                    }
                }
            }
        }
        System.out.println(cnt);
    }

}

