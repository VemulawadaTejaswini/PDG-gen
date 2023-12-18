import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        if(A*N<B){
            System.out.println(A*N);
        }else{
            System.out.println(B);
        }
    }
}