import static java.lang.Integer.min;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int w[] = new int[N];
        int difference[] = new int[N];
        for(int i = 0; i < w.length; i++){
            w[i] = sc.nextInt();
        }
        int point = 0;
        
        while(point < N){
            int front = 0;
            int back = 0;
            for(int i = 0; i < point; i++){
                front += w[i];
            }
            for(int i = point; i < N; i++){
                back += w[i];
            }
            difference[point] = Math.abs(front - back);
            point++;
        }
        
        int min = difference[0];
        for(int i = 1; i < difference.length; i++){
            min = min(min,difference[i]);
        }
        
        
        System.out.println(min);
        
    }
}
