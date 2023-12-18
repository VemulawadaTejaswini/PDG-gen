
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        String[] s = br.readLine().split(" ");
        for(int i = 0;i<N;i++){
            a[i] = Integer.parseInt(s[i]);
        }
        
        
        selection_sort A = new selection_sort(a);
        int[] ans = A.C;
        for(int i=0;i<N-1;i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println(a[N-1]);
        System.out.println(A.Nswap);
        
        
        
        
    }
    
}

class selection_sort{
    int[] C;
    int Nswap = 0;
    selection_sort(int[] C){
        for(int i = 0; i<C.length; i++){
            int mini = i;
            for(int j = i; j<C.length; j++){
                if(C[j]<C[mini]){
                   mini = j; 
                }
            }
            if(mini!=i){
                int tmp = C[i];
                C[i] = C[mini];
                C[mini] = tmp;
                Nswap++;
            }
        }
        this.C = C;
        
    }
}