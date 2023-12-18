import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();

        int wsize = t.length();
        int mcount = 0;
        for(int i = 0 ; i < s.length() - wsize + 1; i++){
            int temp = 0;
            String k = s.substring(i, wsize + i);
            for(int j = 0 ; j < wsize ; j++){
                if(t.charAt(j) == k.charAt(j)) temp++;
            }
            mcount = Math.max(temp,mcount);
        }

        System.out.println(wsize - mcount);

    }
}