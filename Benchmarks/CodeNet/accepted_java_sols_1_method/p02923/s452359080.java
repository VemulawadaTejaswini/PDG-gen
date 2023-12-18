import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int h[] = new int[n];
        int count = 0;
        int max = 0;
        
        for(int i = 0; i < n; i++){
            h[i] = stdIn.nextInt();
        }
        
        for(int i = 0; i < n - 1; i++){
            for(int j = i; j < n - 1; j++){
                if(h[j] >= h[j + 1]){
                    count++;
                }else{
                    break;
                }
            }
            
            if(max < count){
                max = count;
            }
            i += count;
            count = 0;
        }

        
        System.out.println(max);
    }
}
