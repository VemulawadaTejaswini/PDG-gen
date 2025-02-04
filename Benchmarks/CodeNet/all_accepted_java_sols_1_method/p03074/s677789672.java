import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String s = in.next();
        char first = s.charAt(0);
        List<Integer> l = new ArrayList<>(n);
        char prevChar = first;
        int currentStreak = 1;
        int maxStreak = 0;
        for(int i=1; i<n; i++) {
            char c = s.charAt(i);
            if(prevChar == c) {
                currentStreak++;
            }
            else {
                maxStreak = Math.max(maxStreak, currentStreak);
                l.add(currentStreak);
                currentStreak = 1;
                prevChar = c;
            }
        }
        maxStreak = Math.max(maxStreak, currentStreak);
        l.add(currentStreak);

        int result = 0;
        for(int i=0; i<l.size(); i++) {
            boolean subListStartsWith0 = (first == '0') ^ (i%2==1);
            if(i>0 && subListStartsWith0) {
                continue;
            }
            int subListLength = k*2+1;
            if(subListStartsWith0) {
                subListLength = k*2;
            }
            int score = 0;
            for(int j=i; j<Math.min(l.size(), i+subListLength); j++) {
                score += l.get(j);
            }
            result = Math.max(result, score);
            if(maxStreak == 1) {
                // dirty code!!!!!
                break;
            }
        }
        System.out.println(result);
    }
}
