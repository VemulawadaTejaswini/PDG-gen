import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int ans = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    int flag = 1;
                    for (int pos = 0; pos < n; pos++) {
                        // System.out.println("" + i + j + k);
                        // System.out.println("flag:" + flag);
                        // System.out.println("s.charAt(pos):" + String.valueOf(s.charAt(pos)));
                        if (flag == 1 && String.valueOf(s.charAt(pos)).equals(String.valueOf(i))) {
                            flag++;
                        } else if (flag == 2 && String.valueOf(s.charAt(pos)).equals(String.valueOf(j))) {
                            flag++;
                        } else if (flag == 3 && String.valueOf(s.charAt(pos)).equals(String.valueOf(k))) {
                            flag++;
                        }
                        if (flag == 4) {
                            // System.out.println("" + i + j + k);
                            ans++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(ans);

        sc.close();
    }

}
