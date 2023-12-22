import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        int count = 0;
        int num[] = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = stdIn.nextInt();
        }
        
        Arrays.sort(num);
                
        int k = num[n / 2] - num[n / 2 - 1];
        
        System.out.println(k);
    }
}
