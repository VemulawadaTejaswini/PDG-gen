import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String[] s = new String[n.length()];
        List<String> ans = new ArrayList<String>();
        s = n.split("");
        int index =0;
        for (int i = 0; i < n.length(); i++) {
            if (s[i].equals("0")) {
                ans.add("0");
            } else if (s[i].equals("1")) {
                ans.add("1");
            } else {
                if(ans.contains("0")|| ans.contains("1")) {
                    ans.remove(index - 1);
                    index --;
                    continue;
                }else{
                        continue;
                }

            }
            index ++;
        }
        for (int k = 0; k < ans.size(); k++) {
            System.out.print(ans.get(k));
        }

    }
}
