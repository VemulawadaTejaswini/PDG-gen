import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        String S = sc.next();
        char[] c = S.toCharArray();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i=N;
        int flag = 0;
        loop:while (i>=0) {
            for (int j=M;j>=1;j--) {
                if (i-j<0) continue;
                if (c[i-j]=='0') {
                    i-=j;
                    ans.add(j);
                    break;
                }
                if (j==1) {
                    flag = 1;
                    break loop;
                }
            }
            if (i==0) break;
        }
        if (flag==1) {
            System.out.println(-1);
        } else {
            for (int j=ans.size()-1;j>=0;j--) {
                System.out.println(ans.get(j));
            }
        }
    }
}