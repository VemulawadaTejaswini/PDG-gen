import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String s = in.next();
        LinkedList<Integer> l = new LinkedList<>();
        char prev = s.charAt(0);
        int current = 1;
        for(int i=1; i<n; i++) {
            char c = s.charAt(i);
            if(prev == c) {
                current++;
            }
            else {
                l.add(current);
                current = 1;
                prev = c;
            }
        }
        l.add(current);

        while(k > 0) {
            if(l.size() <= 1) {
                break;
            }
            k--;
            int first = l.pollFirst();
            int second = l.pollFirst();
            int third = 0;
            if(l.size() >= 1) {
                third = l.pollFirst();
            }
            l.offerFirst(first + second + third);
        }
        int result = 0;
        while(!l.isEmpty()) {
            int i = l.pollFirst();
            result += Math.max(0, i-1);
        }
        System.out.println(result);
    }
}
