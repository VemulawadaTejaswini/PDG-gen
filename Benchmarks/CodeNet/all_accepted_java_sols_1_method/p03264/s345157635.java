import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int k = stdIn.nextInt();
        //int b = stdIn.nextInt();
        //int num[] = new int[3];
        //String s = stdIn.next();
        //char c[] = s.toCharArray();
        //boolean flag = true;
        
        if(k % 2 == 0){
            System.out.println(k / 2 * k / 2);
        }else{
            System.out.println(k / 2 * (k + 1) / 2);
        }
        
        
        
        
        //System.out.println();
        //System.out.print();
    }
}
