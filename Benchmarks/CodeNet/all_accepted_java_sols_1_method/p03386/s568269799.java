import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a + c - 1;
        int e = b - c + 1;
        if(d >= e){
            for (int k = a;k <= b;++k){
                System.out.println(k);
            }
        }
        else{
            for (int k = a;k <= d;++k){
                System.out.println(k);
            }
            for (int k = e;k <= b;++k){
                System.out.println(k);
            }
        }
    }
}