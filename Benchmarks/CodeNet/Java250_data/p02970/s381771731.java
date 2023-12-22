import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int D = scan.nextInt(); 
        int count=0;
        count = (N+2*D)/(2*D+1);
        System.out.println(count);
    }
}