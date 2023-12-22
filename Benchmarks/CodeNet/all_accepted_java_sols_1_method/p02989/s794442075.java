
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] d = new int[n];
        for(int i = 0; i < n; i++){
            d[i] = stdIn.nextInt();
        }
        Arrays.sort(d);
        System.out.println(d[ n / 2] - d[n /2 - 1]);    
    }
}