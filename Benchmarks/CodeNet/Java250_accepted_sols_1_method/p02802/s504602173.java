import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] acs = new int[n + 1];
        int[] was = new int[n + 1];

        for(int i = 0; i < m; i++) {
            int p = Integer.parseInt(sc.next());
            String r = sc.next();
            if(r.equals("AC") && acs[p] == 0) {
                acs[p]++;
            }
            else {
                if(acs[p] == 0) {
                    was[p]++;
                }
            }
        }
        long ans = 0;
        long pen = 0;
        for(int i = 0; i < n; i++) {
            ans += acs[i + 1];
            pen += (acs[i + 1] == 1 ? was[i + 1] : 0);
        }
        System.out.println(ans + " " + pen);
    }
}
