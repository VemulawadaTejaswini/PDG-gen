import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int baseN = sc.nextInt();
        int n = baseN;
        
        int s = 0;
        while(n > 0){
            s += n % 10;
            n /= 10;
        }
        
        System.out.println(baseN % s == 0 ? "Yes" : "No");
        
    }
}