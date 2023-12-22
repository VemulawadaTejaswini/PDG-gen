import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A,B;
        A = scan.nextInt();
        B = scan.nextInt();
        double tax8=0.08;
        double tax10=0.10;
        int price=-1;
        for(int i=1;i<=1000;i++){
            if((int)(i*tax8+i)-i==A&&(int)(i*tax10+i)-i==B){
                price = i;
                break;
            }
        }
        System.out.println(price);
    }
}