import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long sum = 0;
        
        int nl[] = new int[n];
        for (int i=0; i<n; i++) {
            nl[i] = sc.nextInt();
            sum = sum +nl[i];
        }
        
        Arrays.sort(nl);
        
        System.out.println(nl[0]+" "+nl[n-1]+" "+sum);
    }
    
}