import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int x = stdIn.nextInt();
        //int num[] = new int[3];
        //String s = stdIn.next();
        //char c[] = s.toCharArray();
        //int sum = 0;
        //boolean flag = true;
        //for(int i = 0; i < s.length(); i++){
        //}
        
        if(a + b >= x && a <= x){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
        //System.out.println();
        //System.out.print();
    }
}
