import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        boolean isFound = false;
        for(int i=0; i<n; i++) {
            if(y == 10000*n) {
                cnt1 = n;
                isFound = true;
                break;
            }

            int tmp1 = 0;
            if(y - (i * 10000) > 0) {
                tmp1 = y - (i * 10000);
            }
            cnt1 = i;

            for(int j=0; j<n-i; j++) {
                if(tmp1 == 5000 * (n-i)) {
                    cnt2 = n-i;
                    isFound = true;
                    break;
                }
                int tmp2 = 0;
                if (tmp1 - (5000 * j) > 0) {
                    tmp2 = tmp1 - (5000 * j);
                }
                cnt2 = j;

                if(tmp2 == 1000*(n-i-j)) {
                    cnt3 = n-i-j;
                    isFound = true;
                    break;
                }
            }
            if(isFound) {
                break;
            }
        }

        if(!isFound) {
            System.out.println("-1" + " " + "-1" + " " + "-1");
        } else {
            System.out.println(Integer.toString(cnt1) + " " + Integer.toString(cnt2) + " " + Integer.toString(cnt3));
        }
    }
}
