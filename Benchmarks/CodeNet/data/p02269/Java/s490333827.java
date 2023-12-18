import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String order, str;
        Set<String> s = new HashSet<String>();
        ArrayList<String> ans = new ArrayList<String>();

        for(int i = 0; i < n; i++){
            order = sc.next();
            str = sc.next();

            if(order.equals("insert")) s.add(str);

            if(order.equals("find")){
                if(s.contains(str)) ans.add("yes");
                else ans.add("no");
            }
        }

        for(int i = 0; i < ans.size(); i++){
            System.out.println(ans.get(i));
        }
        sc.close();
    }
}
