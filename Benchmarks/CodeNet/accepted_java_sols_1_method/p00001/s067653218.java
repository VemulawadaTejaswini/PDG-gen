import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int datas[] = new int[10];
        for(int i = 0;i < 10;i++){
            datas[i] =  Integer.parseInt(br.readLine());
        }
        Arrays.sort(datas);
        System.out.println(datas[9]);
        System.out.println(datas[8]);
        System.out.println(datas[7]);
    }
}