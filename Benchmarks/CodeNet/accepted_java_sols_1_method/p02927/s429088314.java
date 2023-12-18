import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int m = stdIn.nextInt();
        int d = stdIn.nextInt();
        int count = 0;
        
        
        for(int i = 1; i <= m; i++){
            for(int j = 10; j <= d; j++){
                int k = j % 10;
                int h = j / 10;
                if(i == k * h && k != 1 && h != 1){
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}
