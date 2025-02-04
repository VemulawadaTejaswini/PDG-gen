import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s1 = in.next(), s2 = in.next();
        char[][] dm = {s1.toCharArray(), s2.toCharArray()};
        long ans = 1;
        int mod = 1000000007;
        
        int before = 0;
        for(int i = 0; i < n; i++) {
            if(i == 0) {
                if(dm[0][i] == dm[1][i]) {
                    ans = 3;
                    before = 1;
                }else {
                    ans = 6;
                    i++;
                    before = 2;
                }
            }else {
                if(dm[0][i] == dm[1][i]) {
                    ans = (ans % mod) * (long)(before == 1 ? 2 : 1);
                    before = 1;
                }else {
                    ans = (ans % mod) * (long)(before == 1 ? 2 : 3);
                    i++;
                    before = 2;
                }
            }
        }
        System.out.println(ans % mod);
    }
}
