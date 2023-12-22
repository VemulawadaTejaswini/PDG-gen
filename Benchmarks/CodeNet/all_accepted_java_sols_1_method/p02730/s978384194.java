import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n;
        String s,ans="No";
        StringBuilder sbs = new StringBuilder();
        StringBuilder sbh1 = new StringBuilder();
        StringBuilder sbh2 = new StringBuilder();
        
        s = sc.nextLine();
        n = s.length();
        String firstHalf = s.substring(0, (n-1) / 2);
        String secondHalf = s.substring((n+3) / 2 - 1, n);
        
        sbs.append(s);
        sbh1.append(firstHalf);
        sbh2.append(secondHalf);
        
        if(s.equals(sbs.reverse().toString())){
            if(firstHalf.equals(sbh1.reverse().toString())){
                if(secondHalf.equals(sbh2.reverse().toString())){
                    ans = "Yes";
                }
            }
        }
        
        System.out.println(ans);
    }
}
