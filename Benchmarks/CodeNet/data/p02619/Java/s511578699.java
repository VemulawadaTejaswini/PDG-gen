import java.util.Random;
import java.util.Scanner;

public class Main {
    static int d = 365;
    static int[] c = new int[26];
    static int[][] s = new int[d][26];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        d = sc.nextInt();
        for (int i=0;i<26;i++){
            c[i]=sc.nextInt();
        }
        for (int i=0;i<d;i++){
            for (int j=0;j<26;j++){
                s[i][j]=sc.nextInt();
            }
        }
        int[] t = new int[d];
        for (int i=0;i<d;i++)t[i]=sc.nextInt()-1;
        function(t);
    }
    static long function(int[] contest){
        long satisfaction = 0;
        int[] interval = new int[26];
        for (int i=0;i<d;i++){
            satisfaction+=s[i][contest[i]];
            for (int j=0;j<26;j++)interval[j]++;
            interval[contest[i]]=0;
            for (int j=0;j<26;j++)satisfaction-=c[j]*interval[j];
            System.out.println(satisfaction);
        }
        return  satisfaction;
    }
}
