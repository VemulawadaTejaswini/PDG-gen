import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

    static int N;
    static int K;
    static int Q;
    static int A;
    static long B;
    static long C;
    //    static int[][] map;
    static int min = 9999999;
    static long ans = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String t = scanner.nextLine();

        int[] map = new int[26];
        for (int i = 0; i < 26; i++) {
            map[i] = -1;
        }

        boolean ans = true;
        for (int i = 0; i < s.length(); i++) {
            if(map[s.charAt(i) - 'a'] == -1){
                map[s.charAt(i) - 'a'] = t.charAt(i) - 'a';

            }else{
                if(map[s.charAt(i) - 'a'] != t.charAt(i) - 'a'){
                    ans = false;
                }
            }
        }

        String temp = s;
        s = t;
        t = temp;

        for (int i = 0; i < 26; i++) {
            map[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            if(map[s.charAt(i) - 'a'] == -1){
                map[s.charAt(i) - 'a'] = t.charAt(i) - 'a';

            }else{
                if(map[s.charAt(i) - 'a'] != t.charAt(i) - 'a'){
                    ans = false;
                }
            }
        }

        if(ans){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

