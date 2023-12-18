import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        sc.close();

        int tmp = 0;
        for(int i=0; i<s.length()-t.length(); i++) {
            int match = 0;
            for(int j=0; j<t.length(); j++) {
                if(s.charAt(i+j) == t.charAt(j)) {
                    match++;
                }
            }
            tmp = Math.max(tmp,match);
        }
        if(tmp == 0) System.out.println(t.length());
        else System.out.println(t.length()-tmp);
    }
}
