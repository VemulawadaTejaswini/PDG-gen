import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int l = stdIn.nextInt();
        int min = 101;
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            if(Math.abs(l + i) < Math.abs(min)){
                min = l + i;
            }
            
            sum = sum + l + i;
        }
        
        System.out.println(sum - min);
    }
}
