import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        // ?????????????§???????
        String ans = "ABCDEFGHIJKLMNOPQLSTUVWXYZ";
        while(true) {
        int n = Integer.parseInt(GetSubStringLine()[0]);
        if (n == 0) {
            break;
        }
        String[] s = GetSubStringLine();
        int[] a = new int[26];
        boolean flag1 = false;
        for (int i=0;i<s.length;i++) {
            int in = s[i].charAt(0)-'A';
            a[in]++;
            boolean flag = false;
            int maxIn=0,max=0;
            for (int j=0;j<a.length;j++) {
                if (a[j] > max) {
                    max = a[j];
                    maxIn = j;
                }
            }
            for (int j=0;j<a.length;j++) {
                if (j != maxIn) {
                    if (max <= a[j] + s.length - i - 1) {
                        flag = true;
                        break;
                    }
                }
            }
            if (!flag) {
                System.out.println(ans.charAt(maxIn) + " "+(i+1));
                flag1 = true;
                break;
            }
        }
        if (!flag1) {
            System.out.println("TIE");
        }
        }
    }

    public static String[] GetSubStringLine() {
        String s = sc.nextLine();
        return s.split(" ");
    }
}