
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = -1000001;
        int min = 1000001;
        long sum = 0;
        int n = scanner.nextInt();
        int i= 0;
        while(i < n){
            int x = scanner.nextInt();
            sum += x;
            if( max < x ){
                max = x;
            }
            if(min > x){
                min = x;
            }
            i++;
        }
        System.out.println(min+" "+max+" "+sum);
    }
}

