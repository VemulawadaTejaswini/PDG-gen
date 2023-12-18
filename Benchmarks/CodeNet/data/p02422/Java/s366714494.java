import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //StringBuilder bd = new StringBuilder();
        ArrayList<String> A = new ArrayList<String>();
        //int[] A = new int[26];
        //Arrays.fill(A, 0);
        //String str;

        String str = sc.nextLine();
        String newStr = new String();
        newStr = str.substring(0);
        int q = sc.nextInt();
        String dummy = sc.nextLine();
        for (int i=0; i<q; i++) {
            String command = sc.nextLine();
            String[] S = command.split(" ");
            switch (S[0]) {
                case "print": {
                    System.out.println(newStr.substring(Integer.valueOf(S[1]), Integer.valueOf(S[2])+1));
                    break;
                }
                case "reverse": {
                   newStr = reverse(newStr, Integer.valueOf(S[1]), Integer.valueOf(S[2]));
                   break;
                }
                case "replace": {
                    newStr = replace(newStr, S[3], Integer.valueOf(S[1]), Integer.valueOf(S[2]));
                    break;
                }
            }
        }

    }
    public static String reverse(String str1, int a, int b) {
        String newstr = new String();
        if (a > 0) newstr += str1.substring(0, a);
        for (int i=b; i>=a; i--) {
            newstr += str1.substring(i, i+1);
        }
        if (b < str1.length()-1) newstr += str1.substring(b+1);
        return newstr;
    }

    public static String replace(String str1, String str2, int a, int b) {
        String newstr = new String();
        if (a > 0) newstr += str1.substring(0, a);
        newstr += str2;
        if (b < str1.length()-1) newstr += str1.substring(b+1);
        return newstr;
    }
}
