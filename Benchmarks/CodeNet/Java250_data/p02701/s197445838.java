import java.util.HashMap;
import java.util.Scanner;

/*
問題文

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];

        HashMap<String, Integer> list = new HashMap<>();
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            if (list.containsKey(s[i])) {
                list.put(s[i], list.get(s[i]) + 1);
            } else {
                list.put(s[i], 0);
            }
        }
        System.out.println(list.size());
    }
}