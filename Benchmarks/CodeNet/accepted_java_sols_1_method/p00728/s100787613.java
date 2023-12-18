
import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        while(true){
            int n = scan.nextInt();
            if(n == 0 )break;
            int sum = 0, min = 1000, max = 0;
            for(int i = 0;i < n;i++){
                int x = scan.nextInt();
                sum += x;
                if(min > x)min = x;
                if(max < x)max = x;
            }
            sum = sum - min - max;
            System.out.println(sum/(n-2));
        }
        
        scan.close();
    }

    

}
