import java.util.*;
 
public class Main{
    static int N;
    static int min;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        sc.close();
        min = N;
        for(int i = 0; i <= N; i++){
            int by_6 = i;
            int by_9 = N-i;
            int count = 0;
            while(by_6 > 0){
                count += (by_6 % 6);
                by_6 /= 6;
            }
            while(by_9 > 0){
                count += (by_9 % 9);
                by_9 /= 9;
            }
            min = Math.min(count, min);
        }
        System.out.println(min);
    }

}