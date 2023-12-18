import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int r = stdIn.nextInt();
        //int k = stdIn.nextInt();
        //int b = stdIn.nextInt();
        //int num[] = new int[3];
        //String s = stdIn.next();
        //char c[] = s.toCharArray();
        //boolean flag = true;
        
        if(r < 1200){
            System.out.println("ABC");
        }else if(r < 2800){
            System.out.println("ARC");
        }else{
            System.out.println("AGC");
        }
        
        //System.out.println();
        //System.out.print();
    }
}
