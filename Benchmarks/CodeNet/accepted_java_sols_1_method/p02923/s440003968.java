import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] H = new long[N];
        int counter = 0;
        int countMax = 0;
        
        for(int i = 0; i < N; i++){
            H[i] = sc.nextLong();
            if(i > 0){
                if(H[i-1] >= H[i]){
                    counter++;
                }
                if(H[i-1] < H[i]){
                    if(counter > countMax){
                        countMax = counter;
                    }
                    counter = 0;
                }
            }
        }
        
        if(counter > countMax){
            countMax = counter;
        }
        
        System.out.println(countMax);
    }
}