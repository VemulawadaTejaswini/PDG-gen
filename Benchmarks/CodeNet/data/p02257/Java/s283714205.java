import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++){
            int m = s.nextInt();
            boolean result = isprime(m);
            if(result == true){
                count++;
            }
        }
        System.out.println(count);
    }
    public static Boolean isprime(int x){
        if(x == 2){
            return true;
        }else if(x < 2 || x % 2 == 0){
            return false;
        }else{
            for(int i = 3; i <= Math.sqrt(x);i += 2){
                if(x % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
