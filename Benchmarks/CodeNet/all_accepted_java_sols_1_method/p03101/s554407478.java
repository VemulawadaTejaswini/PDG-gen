import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int H = stdIn.nextInt();
        int W = stdIn.nextInt();
        int h = stdIn.nextInt();
        int w = stdIn.nextInt();
        //int n = stdIn.nextInt();
        //int k = stdIn.nextInt();
        //String s = stdIn.next();
        
        System.out.println(H * W - h * W - H * w + h * w);
        //System.out.println();
        //System.out.print();
    }
}
