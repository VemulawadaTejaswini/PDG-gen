import java.util.*;
import java.text.*;

class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        Comparator<String> cs = new Comparator<String>() {
            public int compare(String s1, String s2) {
                int l1 = s1.length();
                int l2 = s2.length();
                int l = Math.min(l1, l2);
                for(int i = 0; i < l; i++) {
                    int d = s1.charAt(i) - s2.charAt(i);
                    if(d != 0) return d;
                }
                return l1 - l2;
            }
            public boolean equals(Object o) {
                return o == this;
            }
        };
        int n = sc.nextInt();
        int c1 = 0, c2 = 0;
        while(n-->0){
            String x = sc.next();
            String y = sc.next();
            int c = cs.compare(x, y);
            if(c < 0) {
                c2 += 3;
            } else if(c > 0) {
                c1 += 3;
            } else {
                c2 ++;
                c1 ++;
            }
        }
        System.out.println("" + c1 + " " + c2);
    }
}