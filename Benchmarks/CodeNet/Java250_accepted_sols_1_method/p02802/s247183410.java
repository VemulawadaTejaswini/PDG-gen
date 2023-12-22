import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] p = new int[m];
        String[] s = new String[m];
        for(int i = 0; i < m; i++){
            p[i] = scan.nextInt();
            s[i] = scan.next();
        }
        boolean[] isAc = new boolean[n];
        int ac = 0;
        int[] wa = new int[n];
        for(int i = 0; i < m; i++){
            if(s[i].equals("AC") && !isAc[p[i] - 1]){
                isAc[p[i] - 1] = true;
                ac++;
            }else if(s[i].equals("WA") && !isAc[p[i] - 1]){
                wa[p[i] - 1]++;
            }
        }
        for(int i = 0; i < m; i++) if(!isAc[p[i] - 1]) wa[p[i] - 1] = 0;
        int outWa = 0;
        for(int i = 0; i < n; i++){
            outWa += wa[i];
        }
        System.out.println(ac + " " + outWa);
        scan.close();
    }
}
