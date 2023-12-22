import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long n = Long.parseLong(sc.next());
        long[] x = new long[5];
        for(int i = 0; i < 5; i++){
            x[i] = Long.parseLong(sc.next());
        }
        
        long min = x[0];
        int minIndex = 0;
        for(int i = 1; i < 5; i++){
            if(x[i] < min){
                min = x[i];
                minIndex = i;
            }
        }
        
        long time;
        if(n % x[minIndex] == 0){
            time = n / x[minIndex] +4;
        }else{
            time = n / x[minIndex] +5;
        }
        
        System.out.println(time);
    }
}