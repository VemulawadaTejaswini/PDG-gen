import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] x = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = Integer.parseInt(sc.next());
        }
        
        int min = 1000000000;
        for(int i = 0; i < n-k+1; i++){
            int a = x[i+k-1] - x[i] + Math.min(Math.abs(x[i+k-1]), Math.abs(x[i]));
            if(a < min){
                min = a;
            }
        }
        
        System.out.println(min);
    }
}