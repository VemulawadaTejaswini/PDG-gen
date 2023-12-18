import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String t = sc.next();
        String s = sc.next();

        ArrayList<Integer> list = new ArrayList<>();

        String hantei;
        for(int i = 0; i <= t.length() - s.length(); i++) {
            hantei = t.substring(i, s.length() + i);
            int c = 0;
            for(int j = 0; j < s.length(); j++)
            	if(s.charAt(j) != hantei.charAt(j)) ++c;
            list.add(c);
        }

        Collections.sort(list);
        System.out.println(list.get(0));
    }

}
