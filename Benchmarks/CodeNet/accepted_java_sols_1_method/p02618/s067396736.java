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
        
        // TODO : calc!
        
        for(int i=0; i<d; i++) {
            System.out.println((i%26) + 1);
        }
    }
}
