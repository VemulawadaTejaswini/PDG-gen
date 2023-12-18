    import java.util.*;
     
    public class Main {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String S = sc.next();
        boolean key = false;
        if (S.equals("AAA") || S.equals("BBB")) key = true;
        else ;
        System.out.println(key ? "No" : "Yes");
      }
    }