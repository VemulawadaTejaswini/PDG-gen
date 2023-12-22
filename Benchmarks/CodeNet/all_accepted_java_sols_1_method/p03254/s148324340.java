import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(a);
        int count = 0;
        for(int i = 0; i < N; i++){
            if(x >= a[i] && i != N-1){
                count++;
                x -= a[i];
            }
            if(i == N-1){
                if(x == a[i])
                    count++;
            }
        }

        System.out.println(count);
    }
}