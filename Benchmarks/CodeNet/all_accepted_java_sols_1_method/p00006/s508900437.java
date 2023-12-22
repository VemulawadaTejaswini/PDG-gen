import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        String s = stdIn.next();
        
        char c[] = s.toCharArray(); 
            
        for(int i = s.length() - 1; i >= 0; i--){
            System.out.print(c[i]);
        }
        System.out.println();

        stdIn.close();
    }
}
