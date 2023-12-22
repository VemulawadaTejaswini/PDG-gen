import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int a =N/1000;
        int b =N%1000/100;
        int c =N%100/10;
        int d =N%10;
        
        if(a==b && b==c && c==d){
            System.out.println("Yes");
        }else if(a==b && b==c){
            System.out.println("Yes");
        }else if(b==c && c==d){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}