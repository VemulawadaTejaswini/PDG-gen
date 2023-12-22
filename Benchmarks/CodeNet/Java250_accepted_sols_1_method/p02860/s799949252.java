import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String t;
        String wk;
      
        t = s.substring(n/2);
        wk = t + t;
      	
      	if (wk.equals(s)) {
          System.out.print("Yes");
        } else {
          System.out.print("No");
        }
    }
}