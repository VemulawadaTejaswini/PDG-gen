import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] c = sc.next().toCharArray();

        int r = 0;
        for(int i=0; i<n; i++) {
            if(c[i] == 'R') {
                r++;
            }
        }
        int res = Math.min(r, n-r);
        int a = 0;
        for(int i=0; i<n; i++) {
            if(c[i] == 'R') {
                a++;
            }
            int w = (i+1) - a;
            int rr = r - a;
            if(rr >= w) {
                res = Math.min(res, rr);
            }
        }
        System.out.println(res);

    }




}