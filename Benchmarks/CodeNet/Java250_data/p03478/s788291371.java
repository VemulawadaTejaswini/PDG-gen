import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        int sum = 0;
        for(int i = 1; i <= N; i++){
            if(keta(i)>=A && keta(i)<=B)
                sum += i;
        }
        System.out.println(sum);
   }

    static int keta(int n){
        int sum = 0;
        while(n != 0){
            sum += (n%10);
            n /= 10;
        }
        return sum;
    }
}