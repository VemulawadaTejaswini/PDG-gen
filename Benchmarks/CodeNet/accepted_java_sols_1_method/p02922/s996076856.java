import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int sum = 1;
        int count = 0;
        
        while(sum < b){
            count++;
            sum += a - 1;
        }
        
        System.out.println(count);
    }
}
