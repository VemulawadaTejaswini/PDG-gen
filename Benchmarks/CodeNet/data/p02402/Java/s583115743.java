import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x;
        long min = 10000000;
        long max = -10000000;
        long sum = 0;
        for(int i = 0; i < n; i++){
            x = sc.nextInt();

            sum+= x;
            
            if(min > x){
                min = x;
            }
            if(max < x){
                max = x;
            }
        }
        System.out.println(min + " " + max + " " + sum);
    }
}
