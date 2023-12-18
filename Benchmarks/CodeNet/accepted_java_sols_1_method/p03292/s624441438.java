import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int cost;
        int temp;
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
    
        if(a>b){
            temp = b;
            b = a;
            a = temp;
        }
        if(b>c){
            temp=c;
            c=b;
            b=temp;
        }
        if(a>b){
            temp = b;
            b = a;
            a = temp;
        }
        cost = (b-a)+(c-b);
        System.out.println(cost);
    } 
}