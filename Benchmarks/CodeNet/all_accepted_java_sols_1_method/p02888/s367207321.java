import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] L = new int[N];
        for(int i = 0; i < N; i++){
            L[i] = sc.nextInt();
        }
        Arrays.sort(L);
        long result = 0;
        for(int i = N - 1; i > 1; i--){
            int firstIndex = 0;
            int lastIndex = i - 1;
            while(lastIndex - firstIndex > 0){
                if(L[firstIndex] + L[lastIndex] <= L[i]){
                    firstIndex++;
                }else{
                    result += lastIndex - firstIndex;
                    lastIndex--;
                }
            }
        }
        System.out.println(result);
    }
}

