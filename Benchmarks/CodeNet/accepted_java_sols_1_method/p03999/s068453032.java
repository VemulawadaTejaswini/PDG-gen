import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String s = in.nextLine();
        long ans = 0;
        int size = s.length();
        int spaces = size - 1;

        long spacesWithin, reps;
        long num;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                spacesWithin = spaces - 1 - (j - i);
                if (!(i == 0 || j == (size - 1))){
                    --spacesWithin;
                }
                spacesWithin = Math.max(0, spacesWithin);
                reps = 1 << spacesWithin;
                num = Long.parseLong(s.substring(i, j + 1));
                ans += (reps * num);
            }
        }

        System.out.println(ans);
    }
}






















