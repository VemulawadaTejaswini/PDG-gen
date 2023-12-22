import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char[] c = S.toCharArray();

        ArrayList<HashSet<Integer>> list = new ArrayList<HashSet<Integer>>();
        for (int i=0;i<N+1;i++) {
            HashSet<Integer> set = new HashSet<Integer>();
            list.add(set);
        }
        for (int i=N-1;i>=0;i--) {
            HashSet<Integer> set = new HashSet<Integer>(list.get(i+1));
            set.add((int)c[i]-48);
            list.get(i).addAll(set);
        }

        int ans = 0;
        for (int i=0;i<10;i++) {
            for (int j=0;j<10;j++) {
                boolean i_flag = false;
                for (int k=0;k<N;k++) {
                    if (i_flag==false && (int)c[k]-48==i) {
                        i_flag=true;
                        continue;
                    }
                    if (i_flag==true && (int)c[k]-48==j) {
                        ans += list.get(k+1).size();
                        // System.out.println("i, j, k, size:"+i+" "+j+" "+k+" "+list.get(k+1).size());
                        break;
                    }
                }
            }
        }
        System.out.println(ans);

        // for (int i=0;i<list.size();i++) {
        //     System.out.println(list.get(i));
        // }
    }
}