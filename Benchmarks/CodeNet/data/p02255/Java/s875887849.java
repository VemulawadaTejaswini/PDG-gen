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
        insertionSort(a, n);
    }

    public static void insertionSort(int[] a, int n){
        int i, j, v;
        StringBuilder sb = new StringBuilder();
        for(i = 0; i < n; i++){
            sb.append(a[i]);
            if(i != n-1)sb.append(" ");
            if(i == n-1)sb.append("\n");
        }
        for(i = 1; i < n; i++){
            v = a[i];
            j = i - 1;
            while(j >= 0 && a[j] > v){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = v;
            for(int k = 0; k < n; k++){
                sb.append(a[k]);
                if(k != n-1) sb.append(" ");
                //System.out.println(sb);                                           
                //sb.delete(0, sb.length());                                        
                if(k == n-1) sb.append("\n");
            }
        }
        System.out.print(sb);
    }

}