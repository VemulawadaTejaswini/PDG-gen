import java.util.Scanner;

class Main{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        scan.close();
        int ans = (1 << 16);
        for (int i = 0; i <= s.length() - 3; i++)
        {
            String tmp = s.substring(i, i + 3);
            ans = Math.min(Math.abs(753 - Integer.parseInt(tmp)), ans);
        }
        System.out.println(ans);
    }
}