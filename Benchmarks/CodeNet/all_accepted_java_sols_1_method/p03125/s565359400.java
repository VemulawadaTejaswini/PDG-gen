import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        //int c = stdIn.nextInt();
        //int w = stdIn.nextInt();
        //int n = stdIn.nextInt();
        //int k = stdIn.nextInt();
        //String s = stdIn.next();
        //char c[] = s.toCharArray();
        //boolean heisei = true;
        
        if(b % a == 0){
            System.out.println(a + b);
        }else{
            System.out.println(b - a);
        }
        
        //System.out.println();
        //System.out.print();
    }
}
