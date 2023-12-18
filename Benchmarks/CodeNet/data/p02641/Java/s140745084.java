import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        
        int minDiff = 10000;
        int closest = -1;
        boolean[] vals = new boolean[101];
        for(int i = 0 ; i < n ; i++) {
            vals[scan.nextInt()] = true;
        }
        if(x == 0 && vals[0]) {
            System.out.println("-1");
            return;
        }
        if(x == 100 && vals[100]) {
            System.out.println("101");
            return;
        }
        
        for(int i = 0 ; i <= 100 ;i++) {
            if(!vals[i]) {
                if(minDiff > Math.abs(x-i)) {
                    minDiff = Math.abs(x-i);
                    closest = i;
                }    
            }
        }
        System.out.println(closest);
    }
}