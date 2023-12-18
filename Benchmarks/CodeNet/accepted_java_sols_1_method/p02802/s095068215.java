import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(m == 0) {
            System.out.println("0 0");
            return;
        }
        String[][] p = new String[m][2];
        for(int i=0; i<m; i++) {
            p[i][0] = sc.next();
            p[i][1] = sc.next();
        }
        boolean[] acA = new boolean[n+1];
        int [] waA = new int[n+1];
        int wa = 0;
        int ac = 0;
        for(int i=0; i<m; i++) {
            int a = Integer.parseInt(p[i][0]);
            if(acA[a]) continue;
            if("WA".equals(p[i][1])) {
                waA[a]++;
            }else {
                ac++;
                wa += waA[a];
                acA[a] = true;
            }
        }
        System.out.println(ac + " " + wa);
    }
}