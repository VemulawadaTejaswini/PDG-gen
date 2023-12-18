import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] is = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            is[i] = (int)(s.charAt(i)) - (int)('0');
        }
        int min = Integer.MAX_VALUE;
        for(int i=0; i<s.length()-2; i++){
            int tmp = is[i]*100 + is[i+1]*10 + is[i+2];
            min = Math.min(Math.abs(tmp - 753), min);
        }

        System.out.println(min);
    }
}