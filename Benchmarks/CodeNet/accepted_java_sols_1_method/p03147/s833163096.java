import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] h = new int[n+1];
        for(int i = 0; i < n; i++){
            h[i] = Integer.parseInt(sc.next());
        }
        
        int count = 0;
        for(int i = 1; i <= 100; i++){
            for(int j = 0; j < n; j++){
                if(h[j] >= i && h[j+1] < i){
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}