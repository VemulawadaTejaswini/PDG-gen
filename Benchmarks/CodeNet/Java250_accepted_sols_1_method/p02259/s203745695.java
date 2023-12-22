import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author Y
 */
public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        String[] s = br.readLine().split(" ");
        for(int i = 0;i<N;i++){
            a[i] = Integer.parseInt(s[i]);
        }
        
        int Nswap = 0;
        for(int i=0;i<N;i++){
            for(int j = N-1;j>=i+1;j--){
                if(a[j]<a[j-1]){
                    int tmp = a[j];
                    a[j]=a[j-1];
                    a[j-1]=tmp;
                    
                    Nswap++;
                }
            }
        }
        
        for(int i=0;i<N-1;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println(a[N-1]);
        System.out.println(Nswap);
        
    }
}