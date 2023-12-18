import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int k = stdIn.nextInt();
        int p[] = new int[n];
        
        double max = 0;
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            p[i] = stdIn.nextInt();
            if(i < k){
                sum += p[i];
            }
        }
        
        max = sum;
        int index = 0;
        
        for(int i = k; i < n; i++){
            sum -= p[i - k];
            sum += p[i];
            if(sum > max){
                max = sum;
                index = i - k;
            }
        }
        
        double kitaichi = max / 2 + 0.5 * k;

        System.out.println(kitaichi);
        
        
    }
}
