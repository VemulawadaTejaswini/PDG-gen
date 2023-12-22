import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int max = 0;
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                max = Math.max(Math.abs(a[i] - a[j]), max);
            }
        }

        if(max > k) System.out.println(":(");
        else System.out.println("Yay!");
        
    } 
}