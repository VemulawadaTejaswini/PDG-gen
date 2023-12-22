import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] w = new int[n];
        int s1 = 0;
        int s2 = 0;
        for(int i = 0; i < n; i++){
            w[i] = Integer.parseInt(sc.next());
            s2 += w[i];
        }
        
        int min = 10000;
        int abs;
        for(int i = 0; i < n-1; i++){
            s1 += w[i];
            s2 -= w[i];
            abs = Math.abs(s1 - s2);
            if(abs < min){
                min = abs;
            }
        }
        
        System.out.println(min);
    }
}