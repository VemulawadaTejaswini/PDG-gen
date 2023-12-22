import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Hi[] = new int[N];
        
        for(int i = 0; i < N; i++){
            Hi[i] = sc.nextInt();
        }
        
        int rightMoveCount[] = new int[N];
        rightMoveCount[N-1] = 0;
        
        int rightMoveCountMax = 0;
        
        for(int i = N -2; i >= 0; i--){
            if(Hi[i] >= Hi[i+1]){
                rightMoveCount[i] = rightMoveCount[i+1] + 1;
            } else {
                rightMoveCount[i] = 0;
            }
            
            rightMoveCountMax = Math.max(rightMoveCount[i],rightMoveCountMax);
        }
        
        System.out.println(rightMoveCountMax);
    }
}
