import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int total = 0;
        if(a > b){
            total += a;
            a--;
        }else{
            total += b;
            b--;
        }
        
        if(a > b){
            total += a;
        }else{
            total += b;
        }
        
        System.out.println(total);
        
    }
}
