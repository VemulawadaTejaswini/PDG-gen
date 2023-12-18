import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        String[] t = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(t[i]);
        }

        babbleSort(a, n);
    }

    public static void babbleSort(int[] a, int n){
        int flag = 1;
        int temp, count = 0;
        while(flag == 1){
            flag = 0;
            for(int i = n - 1; i > 0; i--){
                if(a[i-1] > a[i]){
                    temp = a[i-1];
                    a[i-1] = a[i];
                    a[i] = temp;
                    flag = 1;
                    count++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < n; j++){
            if(j != 0) sb.append(" ");
            sb.append(a[j]);
        }
        sb.append("\n").append(count);
        System.out.println(sb);
    }

}