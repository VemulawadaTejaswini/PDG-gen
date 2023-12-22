import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int tmp = 0;
        for(int i = 1; i < N; i++) {
            tmp = sc.nextInt();
            arr[tmp - 1] += 1;
        }
        for(int j = 0; j < N; j++) {
            System.out.println(arr[j]);
        }
    }
}