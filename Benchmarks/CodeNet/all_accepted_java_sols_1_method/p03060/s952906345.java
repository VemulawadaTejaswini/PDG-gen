import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        int N = sn.nextInt();
        int[] valueArray = new int[N];
        int[] costArray = new int[N];
        int maxValue = 0;
        
        for(int i = 0; i< N; i++) {
            valueArray[i] = sn.nextInt();
        }
        
        for(int i=0; i < N; i++){
            costArray[i] =sn.nextInt();
        }
        
        for(int i=0; i < N; i++){
            
            int diff = valueArray[i] - costArray[i];
            if(diff > 0){
                maxValue = maxValue + diff;
            }
        }
        System.out.println(maxValue);
        
    }
}