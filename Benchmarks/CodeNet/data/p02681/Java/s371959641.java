import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      	Scanner sc = new Scanner(System.in);
     	String s = sc.nextLine();
      	String t = sc.nextLine();
        String t2 = t.substring(0, s.length());
        if(s.equals(t2)) System.out.println("Yes");
        else System.out.println("No");
    }
  
}
