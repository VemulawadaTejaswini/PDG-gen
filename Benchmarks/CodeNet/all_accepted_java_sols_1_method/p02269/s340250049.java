import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       Map<String,Integer> S = new HashMap<>();
        for(int i=0;i<n;i++){
            String s = sc.next();
            String t = sc.next();
            if(s.charAt(0)=='i') S.put(t,1);
            else if(S.get(t)==null) System.out.println("no");
            else System.out.println("yes");
        }
    }
}
