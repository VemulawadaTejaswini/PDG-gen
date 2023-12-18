import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        String line = sc.nextLine();
        String line1 = sc.nextLine();
        String[] s = line.split("");
        String[] p = line1.split("");
        String answer = "No";
        for(int i = 0; i < s.length; i++) {
            if(s[i].equals(p[0])) {
                String ans = "";
                for(int j = 0; j < p.length; j++) {
                    if(i + j < s.length) {
                        ans += s[i + j];
                    }else {
                        ans += s[i + j - s.length];
                    }
                }
                if(ans.equals(line1)) {
                    answer = "Yes";
                }
            }
        }
        System.out.println(answer);

    }
 }
