import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        sc.close();

        if(Character.isUpperCase(N.charAt(0))){
            System.out.println("A");
        }else{
            System.out.println("a");
        }
    }
}
