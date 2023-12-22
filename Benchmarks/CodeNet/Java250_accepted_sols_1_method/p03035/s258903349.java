import java.util.Scanner;

public class Main{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        
        int price;
        
        if(A>=13) {
        	price=B;
        }
        else if(A<=12&&A>=6) {
        	price=B/2;
        }
        else {
        	price=0;
        }
        
        System.out.print(price);
        sc.close();
    }
}