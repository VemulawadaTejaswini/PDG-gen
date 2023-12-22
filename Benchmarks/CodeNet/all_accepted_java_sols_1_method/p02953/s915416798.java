import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] h = new int[n];
        for(int i = 0; i < n; i++){
            h[i] = sc.nextInt();
        }

        int max = 1;

        for(int i = 0; i < n; i++){
            if(h[i] > max){
                max = h[i];
            } else if(max - h[i] > 1){
                System.out.println("No");
                return;
            }
        }


        System.out.println("Yes");
    }
}