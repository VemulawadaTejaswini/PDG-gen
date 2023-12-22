import java.util.*;

public class Main {
    public static void main(String[] args){
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int result = 0;
        
        for(int i = 1; i <= N ; i++){

            int sum = sumDigits(i);
            if(sum >= A && sum <= B){
                result += i;
            }
        }

        System.out.println(result);
    }
    
    public static int sumDigits(int n){
        int sum = 0;
        
        while(n != 0){
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
