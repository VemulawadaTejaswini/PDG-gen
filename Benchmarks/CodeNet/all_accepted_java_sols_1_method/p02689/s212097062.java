import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int [] H = new int[N];
        int [] T = new int[N];
        Arrays.fill(T, 1);
        int count = 0;
        for(int i = 0; i < N; i++){
            H[i] = Integer.parseInt(sc.next());
        }
        for(int i = 0; i < M; i++){
            int A = Integer.parseInt(sc.next())-1;
            int B = Integer.parseInt(sc.next())-1;
            if(H[A] > H[B]){
            	T[B] = 0;
            }
          	else if(H[A] < H[B]){
              	T[A] = 0;
            }
          	else if(H[A] == H[B]){
           		 T[A] = 0;
           		 T[B] = 0;
            }
        }
        
        
        for(int i = 0; i < N; i++){
            if(T[i] != 0){
                count++;
            }
        }
        System.out.println(count);
    }

}
