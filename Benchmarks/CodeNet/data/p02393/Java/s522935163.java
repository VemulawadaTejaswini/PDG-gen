import java.util.Scanner;
public class Main { 
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int temp1, temp2, temp3;
        if(a > b){
            temp1 = a;
            a = b;
            b = temp1;
        }
        if(b > c){
            temp2 = b;
            b = c;
            c = temp2;
        }
        if(c > a){
            temp3 = c;
            c = a;
            a = temp3;
        } 
    }
}