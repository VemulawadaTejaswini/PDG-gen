import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        sc.close();

        int ans = 0;
        for(int i=0; i<=s.length()-t.length(); i++) {
            int match = 0;
            for(int j=0; j<t.length(); j++) {
                if(s.charAt(i+j) == t.charAt(j)) {
                    match++;
                }
            }
            ans = Math.max(ans,match);
        }
        if(ans != 0) System.out.println(t.length()-ans);
        else System.out.println(t.length());

    }
}
