import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        int d = stdIn.nextInt();
        //int num[] = new int[3];
        //String s = stdIn.next();
        //char c[] = s.toCharArray();
        //boolean flag = true;
        
        if(d >= Math.abs(a - c)){
            System.out.println("Yes");
        }else{
            if(d >= Math.abs(a - b) && d >= Math.abs(b - c)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        
        
        //System.out.println();
        //System.out.print();
    }
}
