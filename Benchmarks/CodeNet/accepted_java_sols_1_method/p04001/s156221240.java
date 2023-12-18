// writed 2020/03/25
// bit全探索
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        scanner.close();
        int length = S.length() - 1;
        long sum = 0L;

        for(int i=0;i<(1<<length);i++) {
            StringBuilder sb = new StringBuilder(S);
            for (int j=length-1; j>=0; j--) {
				if ((1&i>>j) == 1) {
					sb.insert(j+1,"+");
				}
			}

            String[] s = sb.toString().split("\\+",0);
            for(int k=0;k<s.length;k++) {
                sum += Long.parseLong(s[k]);
            }
        }

        System.out.println(sum);
    }
}