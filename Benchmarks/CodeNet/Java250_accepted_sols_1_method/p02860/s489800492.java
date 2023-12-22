 import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a  = Integer.parseInt(sc.next());
        String str = sc.next();
        if(a % 2 == 1){
            System.out.println("No");
            System.exit(0);
        }
        String m = str.substring(a/2);
        if(str.substring(0,a/2).equals(m)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
