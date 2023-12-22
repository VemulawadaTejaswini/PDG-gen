import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String U = scanner.next();
        
        if(U.equals(S)){
            System.out.print(A-1);
            System.out.print(" ");
            System.out.println(B);
        }else{
            System.out.print(A);
            System.out.print(" ");
            System.out.println(B-1);
        }
        
    }
}
