import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int ac = 0;
        int wa = 0;
        int[] sub = new int[n];

        for(int i = 0; i < m; i++){
            int p = sc.nextInt() - 1;
            boolean s = sc.next().equals("AC");
            if(s && sub[p] > -1){
                wa += sub[p];
                sub[p] = -1;
                ac++;
            }else if(!s && sub[p] > -1){
                sub[p]++;
            }
        }

        System.out.println(ac + " " + wa);

    }
}
