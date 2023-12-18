
import java.util.Scanner;

public class Main {
    
    public static final int N = 3;

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();
        
        for(int i=1; i<=N; i++){
            if(val1 > val2){
                int temp = val1;
                val1 = val2;
                val2 = temp;
            }else if(val2 > val3){
                int temp = val2;
                val2 = val3;
                val3 = temp;
            }
        }
        
        System.out.println(val1 +" "+ val2 +" "+ val3);
    }
    
}
