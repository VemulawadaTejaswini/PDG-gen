import java.util.*;

public class Main {
    public static void main(String[] args){
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int N = sc.nextInt();
        
        int result = 0;
        int cal = 0;
        
        for(int i = 0; i <= A; i++){
            for(int j = 0; j <= B; j++){
                for(int k = 0; k <= C; k++){
                    cal = (500 * i) + (100 * j) + (50 * k);
                    if(cal == N){
                        result++;
                    }
                    cal = 0;
                }
            }
        }
        System.out.println(result);
        
    }
}
