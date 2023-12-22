import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[m];
        String[] s = new String[m];

        for (int i=0; i<m; i++){
            p[i] = sc.nextInt();
            s[i] = sc.next();
        }

        int ac = 0;
        int wa = 0;

        Set<Integer> set = new TreeSet<>();

        for (int i=0; i<m; i++){
            int tmp = p[i];
            String str = s[i];
            if (str.equals("AC") && !set.contains(tmp)){
                ac++;
                set.add(tmp);
            }
        }

        Set<Integer> set1 = new TreeSet<>();

        for (int i=0; i<m; i++){
            int tmp = p[i];
            String str = s[i];
            if (str.equals("AC")){
                set1.add(tmp);
            }
            if (str.equals("WA") && !set1.contains(tmp)){
                wa++;
            }

        }

        int minus = 0;

        for (int i=0; i<m; i++){
            int tmp = p[i];
            String str = s[i];
            if (str.equals("WA") && !set1.contains(tmp)){
                minus++;
            }
        }

        System.out.print(ac+" ");
        System.out.println(wa-minus);

    }
}
