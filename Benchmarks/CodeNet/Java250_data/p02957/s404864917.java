import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        
        int i = 0;
        for(i = 0; i <= a || i <= b; i++){
            if(Math.abs(a - i) == Math.abs(b - i)){
                System.out.println(i);
                break;
            }
        }
        
        if(i > a && i > b){
             System.out.println("IMPOSSIBLE");
        }
    }
}