import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int x = stdIn.nextInt();
        //int c = stdIn.nextInt();
        //int w = stdIn.nextInt();
        //int n = stdIn.nextInt();
        //int k = stdIn.nextInt();
        //String s = stdIn.next();
        //char c[] = s.toCharArray();
        //boolean heisei = true;
        
        
        if(105 % x == 0 && x != 1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
        //System.out.println();
        //System.out.print();
    }
}
