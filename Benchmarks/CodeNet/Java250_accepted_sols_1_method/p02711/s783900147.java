
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String s = String.valueOf(n);
        for(int i=0;i<s.length();i++){
        if (s.charAt(i) == '7') {
            System.out.println("Yes");
           return;  
        }
        }
            System.out.println("No");
      
      
    }

}
