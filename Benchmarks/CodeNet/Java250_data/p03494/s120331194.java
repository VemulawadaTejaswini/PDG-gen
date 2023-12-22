import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    // 標準入力
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 標準入力数値用
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
        int num = Integer.parseInt(br.readLine().trim());
        int[] arr = inputval();
        int[] counter = new int[num];
        for(int i=0; i<num; i++) counter[i] = 0;
        for(int i=0; i<num; i++){
            while(arr[i]%2 != 1){
                arr[i] /= 2;
                counter[i]++;
            }
        }
        int minnum=Integer.MAX_VALUE;
        for(int i=0; i<num; i++){
            if(counter[i]<minnum) minnum = counter[i];
        }
        System.out.println(minnum);

    }

}

