import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //StringBuilder bd = new StringBuilder();
        //ArrayList<Integer> A = new ArrayList<Integer>();
        int[] A = new int[26];
        Arrays.fill(A, 0);
        String str;

        boolean flag = false;

        String s = sc.next();
        String t = sc.next();

        s = s + s;

        for (int i=0; i<s.length()/2; i++) {
            if (s.substring(i, i+t.length()).equals(t)) {
                System.out.println("Yes");
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("No");
        }

    }
}
