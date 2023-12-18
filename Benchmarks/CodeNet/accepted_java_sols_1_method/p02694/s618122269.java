import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long a = 100;
        
        for(long i = 0; i < X;i++){
            a += a/100;
            if(a >= X){
                System.out.print(i + 1);
                i = X;
            }
        }
    
    }
}