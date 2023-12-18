import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        String[] w = {"Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday"};
        int[] d = {31,29,31,30,31,30,31,31,30,31,30,31};
        int sum = 0;
        
        for(int i = 0;i < a-1; i++){
         sum += d[i];
        }
        sum = sum + b;
         
        System.out.println( w[sum % 7]);
    }
}
        
