import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Set<Integer> s = new HashSet<Integer>();
        s.add(3);
        s.add(5);
        s.add(7);
        if(s.contains(x))System.out.println("YES");
        else System.out.println("NO");
    }
}