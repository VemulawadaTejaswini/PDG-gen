import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        //int k = stdIn.nextInt();
        //int b = stdIn.nextInt();
        //int num[] = new int[3];
        //String s = stdIn.next();
        //char c[] = s.toCharArray();
        //boolean flag = true;
        
        if(n % 2 == 0){
            System.out.println(n);
        }else{
            System.out.println(n * 2);
        }
        
        
        
        //System.out.println();
        //System.out.print();
    }
}
