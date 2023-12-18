import java.util.Random;
import java.util.Scanner;

public class Main {
    static int d = 365;
    static int[] c = new int[26];
    static int[][] s = new int[d][26];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        sc.nextInt();
        for (int i=0;i<26;i++){
            c[i]=sc.nextInt();
        }
        for (int i=0;i<d;i++){
            for (int j=0;j<26;j++){
                s[i][j]=sc.nextInt();
            }
        }
        int[] contest = new int[d];
        int count = 100000;
        for (int i=0;i<d;i++)contest[i]=random.nextInt(26);
        for (int i=0;i<count;i++){
            int[] instance = contest.clone();
            int times = random.nextInt(3)+3;
            int[] choose = new int[times];
            for (int j=0;j<times;j++)choose[j]=random.nextInt(d);
            for (int j=0;j<times;j++)instance[choose[j]]=random.nextInt(26);
            if (function(contest)<function(instance))contest=instance;
        }
        for (int i=0;i<d;i++)System.out.println(contest[i]+1);
    }
    static long function(int[] contest){
        long satisfaction = 0;
        int[] interval = new int[26];
        for (int i=0;i<d;i++){
            satisfaction+=s[i][contest[i]];
            for (int j=0;j<26;j++)interval[j]++;
            interval[contest[i]]=0;
            for (int j=0;j<26;j++)satisfaction-=c[j]*interval[j];
        }
        return  satisfaction;
    }
}
