
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] d = new int[k];
        for (int i = 0; i < k; i++) {
            d[i] = sc.nextInt();
        }
        sc.close();
        String s = "";
        while (true) {
            boolean check = false;
            s = "" + n;
            for (int i = 0; i < s.length(); i++) {
                s = "" + n;
                String str = s.substring(i, i + 1);
                Integer tar = Integer.parseInt(str);
                for (int j = 0; j < k; j++) {
                    if (tar == d[j]) {
                        n++;
                        check = true;
                        continue;
                    }
                }
            }
            if (!check) {
                break;
            }
        }
        System.out.println(n);

    }
}