import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] h = new int[n];
        for(int i = 0; i < n; i++){
            h[i] = Integer.parseInt(sc.next());
        }
        
        int count = 1;
        int max = h[0];
        for(int i = 1; i < n; i++){
            if(h[i] >= max){
                count++;
                max = h[i];
            }
        }
        
        System.out.println(count);
    }
}