import java.util.Scanner;

public class Main {
    static int n;
    static String[] str = new String[12];
    static int[][] alphabet = new int[26][2];
    static int[] used_num = new int[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            n = sc.nextInt();
            if (n==0) break;

            for (int i = 0; i < 26; i++) {
                alphabet[i][0] = alphabet[i][1] = 0;
            }
            for (int i = 0; i < 10; i++) {
                used_num[i] = 0;
            }

            for (int i = 0; i < n; i++) {
                str[i] = sc.next();
                for (int j = 0; j < str[i].length(); j++) {
                    if (str[i].length()>1&&j==0 || alphabet[str[i].charAt(j)-'A'][0]==2){
                        alphabet[str[i].charAt(j)-'A'][0] = 2;
                    }else {
                        alphabet[str[i].charAt(j)-'A'][0] = 1;
                    }
                }
            }

            int cnt = 0;
            for (int i = 0; i < 26; i++) {
                cnt += ((alphabet[i][0]!=0)?1:0);
            }

            System.out.println(dfs(0, cnt));
        }
    }

    static int dfs(int s, int num) {
        int cnt = 0;
        if (num==0){
            return check();
        }else {
            for (int i = s; i < 26; i++) {
                if (alphabet[i][0]!=0){
                    s = i;
                    break;
                }
            }

            for (int i = 0; i < 10; i++) {
                if ((alphabet[s][0]==2 && i==0) || used_num[i]==1) continue;
                alphabet[s][1] = i;
                used_num[i] = 1;
                cnt += dfs(s+1, num-1);
                used_num[i] = 0;
            }

            return cnt;
        }
    }

    static int check() {
        int[] num = new int[n];
        int sum = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                num[i] *= 10;
                num[i] += alphabet[str[i].charAt(j)-'A'][1];
            }
            if(i!=n-1){
                sum += num[i];
            }else {
                ans = num[i];
            }
        }

        return (sum==ans)?1:0;
    }
}