import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static void prime_num_count(int n){
        boolean array[] = new boolean[1000001];
        for (int i = 0; i < n + 1; i++){
            if (i==0||i==1){
                array[i] = false;
            }else{
                array[i] = true;
            }
        }
        int cnt = 0;
        int i = 2;
        while (i * i <= n){
            if (array[i]){
                int j = i + i;
                while (j <= n){
                    array[j] = false;
                    j += i;
                }
            i +=1;
            }
        }           
        for (int q = 0; q < n + 1; q++){
            if (array[q]){
                
                cnt++;
            }
        }
        System.out.println(cnt);
        
    }    
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            prime_num_count(n);
        }
    }
}