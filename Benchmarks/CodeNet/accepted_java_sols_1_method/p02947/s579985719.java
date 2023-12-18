import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i<n; i++) {
            char[] chars = sc.next().toCharArray();
            Arrays.sort(chars);
            str[i] = new String(chars);
        }
        Arrays.sort(str);
        //for(String s: str) System.out.println(s);
        long cnt = 1;
        long ans = 0;
        String pres = str[0];
        for(int i = 1; i<n; i++) {
            String s = str[i];
            if(pres.equals(s)) {
                cnt++;
            }else {
                ans += cnt*(cnt-1)/2;
                cnt=1;
            }
            pres = s;
        }
        //System.out.println(cnt);
        ans += cnt*(cnt-1)/2;

        System.out.println(ans);

    }
}