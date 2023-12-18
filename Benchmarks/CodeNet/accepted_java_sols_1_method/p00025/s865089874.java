import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = in.readLine()) != null) {
            String[] s1 = s.split(" ");
            String[] t = in.readLine().split(" ");

            TreeSet<Integer> a = new TreeSet<>();
            for (int i = 0; i < s1.length; i++) {
                a.add(Integer.parseInt(s1[i]));
            }

            int hit = 0;
            int blow = 0;

            for (int i = 0; i < t.length; i++) {
                int j = Integer.parseInt(t[i]);
                int k = Integer.parseInt(s1[i]);
                if (j == k) hit++;
                else if (a.contains(j)) blow++;
            }

            System.out.println(hit + " " + blow);


        }

    }

}