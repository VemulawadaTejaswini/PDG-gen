import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder bd = new StringBuilder();
        //ArrayList<Integer> A = new ArrayList<Integer>();

        String str = sc.nextLine();
        char[] c = str.toCharArray();

        for (int i=0; i<c.length; i++) {
            if ((int)c[i] >= 65 && (int)c[i] <= 90) {
                bd.append(String.valueOf(c[i]).toLowerCase());
            }
            else if ((int)c[i] >= 97 && (int)c[i] <= 122) {
                bd.append(String.valueOf(c[i]).toUpperCase());
            }
            else {
                bd.append(c[i]);
            }
        }
        System.out.println(bd);
    }
}
