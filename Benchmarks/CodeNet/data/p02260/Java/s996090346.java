import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        for(int i = 0; i<N; i++){
            a[i] = sc.nextInt();
        }
        int time = selsort(a, N);
        for(int i = 0; i<N; i++){
            System.out.printf("%d", a[i]);
            if(i < N-1) System.out.printf(" ");
        }
        System.out.printf("\n%d\n", time);
        sc.close();

    }
    static int selsort(int a[], int size){
        int time = 0;
        int minj;
        for(int i = 0; i<size-1; i++){
            minj = i;
            for(int j = i+1; j<size; j++){
                if(a[j] < a[minj]) minj = j;
            }
            if(i != minj){
                int tmp = a[i];
                a[i] = a[minj];
                a[minj] = tmp;
                time++;
            }
        }
        return time;
    }
}
