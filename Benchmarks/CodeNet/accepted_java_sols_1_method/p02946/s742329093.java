import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long k = sc.nextInt();
        long x = sc.nextInt();

        long min = x - (k - 1);
        long max = x + (k - 1);
        long judge = -1000000;
        if(min < judge){
        
            for(long i = judge; i< judge + k; i++){
                System.out.println(i);
            }
        }else{
             for(long i = min;i <= x;i++){
                System.out.println(i);
            }           
        }

        if(max > 1000000){
            for(long i = 1000000 -k ;i <= 1000000 ;i++){
                System.out.println(i);
            }
        }else{
            for(long i = x+1;i <= max;i++){
                System.out.println(i);
            }           
        }
    }
}