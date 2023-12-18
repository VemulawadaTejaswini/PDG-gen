import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a1 = new int[n];
        int[] a2 = new int[n];
        a1[0] = Integer.parseInt(sc.next());
        for(int i = 1; i < n; i++){
            a1[i] = a1[i-1] + Integer.parseInt(sc.next());
        }
        for(int i = 0; i < n; i++){
            a2[i] = Integer.parseInt(sc.next());
        }
        for(int i = n-2; i >= 0; i--){
            a2[i] += a2[i+1];
        }
        
        int max = 0;
        for(int i = 0; i < n; i++){
            if(a1[i] + a2[i] > max){
                max = a1[i] + a2[i];
            }
        }
        
        System.out.println(max);
    }
}