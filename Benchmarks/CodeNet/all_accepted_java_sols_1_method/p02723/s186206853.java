import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String S = scan.next();
        scan.close();
        
        boolean isTrue = true;

        if(S.charAt(2)!=S.charAt(3)) isTrue = false;
        else if(S.charAt(4)!=S.charAt(5)) isTrue = false; 
        
        if(isTrue) System.out.println("Yes");
        else System.out.println("No");
    }
}