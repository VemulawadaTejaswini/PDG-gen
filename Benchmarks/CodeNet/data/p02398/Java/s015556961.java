import java.util.Scanner;

public class Divisor{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int n = 0;
        for(int i=a; i<=b; i++){
            if(c%i == 0){
                n = n+1;
            }
        }
        
        System.out.println(n);
    } 
}