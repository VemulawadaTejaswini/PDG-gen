import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        int[] ci = new int[26];
        int[][] sdi = new int[d][26];
        for(int i=0; i<26; i++) {
            ci[i] = in.nextInt();
        }
        for(int day=0; day<d; day++) {
            for(int i=1; i<26; i++) {
                sdi[day][i] = in.nextInt();
            }
        }
        
        for(int day=0; day<d; day++) {
            int ans = 1;
            if(day<d-26) {
                int maxS = 0;
                int maxStype = 1;
                for(int i=0; i<26; i++) {
                    if(maxS < sdi[day][i]) {
                        maxS = sdi[day][i];
                        maxStype = i;
                    }
                }
                ans = maxStype;
            }
            else {
                ans = d - day; // FIXME
            }
            System.out.println(ans);
        }
    }
}
