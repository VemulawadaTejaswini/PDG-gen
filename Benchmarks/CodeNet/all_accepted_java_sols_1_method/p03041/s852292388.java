import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        //int a = stdIn.nextInt();
        //int b = stdIn.nextInt();
        int n = stdIn.nextInt();
        //int p = stdIn.nextInt();
        int k = stdIn.nextInt();
        String s = stdIn.next();
        String ss = s.toLowerCase();
        char sc[] = ss.toCharArray();
        char c[] = s.toCharArray();
        
        for(int i = 0; i < n; i++){
            if(i != k - 1){
                System.out.print(c[i]);
            }else{
                System.out.print(sc[i]);
            }
        }
        
        
        
        
        
        System.out.println();
    }
}
