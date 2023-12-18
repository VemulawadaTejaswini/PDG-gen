import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] weeks = { "SAT", "FRI", "THU", "WED", "TUE", "MON", "SUN" };
        String S = sc.next();
        int ans = 0;
        for(int i = 0; i < weeks.length; i++) if(weeks[i].equals(S)) ans = i + 1;
        System.out.println(ans);
    }
}
