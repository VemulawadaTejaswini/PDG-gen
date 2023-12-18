import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        int[] T = new int[N];
        for(int i = 0; i < N; i++)
            T[i] = sc.nextInt();
        sc.close();
        Arrays.sort(T);

        int index = 0;
        int count = 0;
        int now = 0;
        while(index < N){
            int limit = T[index] + K;
            int number = 1;
            while(T[index] <= limit && number <= C){
                index++;
                number++;
                if(index == N)
                    break;
            }
            count++;
        }

        System.out.println(count);


    }
}