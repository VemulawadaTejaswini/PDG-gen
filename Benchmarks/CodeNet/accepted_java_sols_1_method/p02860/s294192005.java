import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String s = sc.next();
        if(n%2 == 0 && s.substring(0,n/2).equals(s.substring(n/2,n))){
            System.out.print("Yes");
        }else{
            System.out.println("No");
        }

    }
}