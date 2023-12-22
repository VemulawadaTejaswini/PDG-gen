import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        List<Character> diff = new ArrayList<Character>(Arrays.asList('A', 'C', 'G', 'T'));

        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = i; j < c.length; j++) {
                if (diff.contains(c[j])) {
                    count++;
                    if (maxCount < count) {
                        maxCount = count;
                    }
                } else {
                    break;
                }
            }
            count = 0;
        }

        System.out.println(maxCount);
        sc.close();
    }
}