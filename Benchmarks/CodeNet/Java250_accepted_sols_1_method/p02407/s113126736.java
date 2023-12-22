import java.util.*;
  
public class Main {
    private static final Scanner scn = new Scanner(System.in);
      
    public static void main(String[] args) {
        int n = scn.nextInt();
        StringBuilder sb = new StringBuilder(scn.next());
        for(int i = 1; i < n; i++) {
            sb.insert(0, scn.next() + " ");
        }
        System.out.println(sb);
    }
}