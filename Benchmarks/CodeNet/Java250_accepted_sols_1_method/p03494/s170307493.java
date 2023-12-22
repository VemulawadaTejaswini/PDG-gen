import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        int[] count = new int[n];
        int div = 0;
        int check = 0;
        for(int i = 0; i < n; i++){
            check = A[i];
            while(check%2 == 0){
                div++;
                check = check/2;
            }
            count[i] = div;
            div = 0;
        }
        Arrays.sort(count);
        System.out.print(count[0]);
    }
}