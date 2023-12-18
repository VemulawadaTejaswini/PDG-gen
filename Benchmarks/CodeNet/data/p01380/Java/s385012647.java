import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Question[] questions = new Question[n];
        for (int i = 0; i < n; i++) {
            questions[i] = new Question(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(questions);
        int max = 0;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (Question q : questions) {
            for (int i = max; i >= 0; i--) {
                if (dp[i] + q.mine <= q.other) {
                    dp[i + 1] = Math.min(dp[i + 1], dp[i] + q.mine);
                    max = Math.max(max, i + 1);
                }
            }
        }
        System.out.println(max);
    }
    
    static class Question implements Comparable<Question> {
        int mine;
        int other;
        
        public Question(int mine, int other) {
            this.mine = mine;
            this.other = other;
        }
        
        public int compareTo(Question another) {
            return other - another.other;
        }
    }
}
