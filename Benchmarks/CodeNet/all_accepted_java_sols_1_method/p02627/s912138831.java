import java.util.*;

public class Main {
    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
      	String A = sc.next();
        int i = 1;
        if(A.matches("[A-Z]")){
            System.out.println("A");
        } else {
            System.out.println("a");
        }

    }
}
