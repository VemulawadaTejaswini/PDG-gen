import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        if(A >= B){
            System.out.println("delicious");
        }else if((B-A) <= X){
            System.out.println("safe");
        }else if((B-A) > X){
            System.out.println("dangerous");
        }
    }   
}