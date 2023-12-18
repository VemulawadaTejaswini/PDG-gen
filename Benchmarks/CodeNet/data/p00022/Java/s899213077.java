import java.util.*;
public class Main{
    void run(){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            int max = Integer.MIN_VALUE;
            int total = 0;
            while(0 < n--){
                total += sc.nextInt();
                max = Math.max(max, total);
                if(total < 0){
                    total = 0;
                }
            }
            System.out.println(max);
        }
    }
    public static void main(String[] args){
        new Main().run();
    }
}