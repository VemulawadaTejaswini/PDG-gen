import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        if(s.contains("A") && s.contains("B")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}