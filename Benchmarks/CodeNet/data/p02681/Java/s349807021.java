import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
      	String u = t.substring(0,t.length()-1);
        if (s.equals(u)){
          
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}