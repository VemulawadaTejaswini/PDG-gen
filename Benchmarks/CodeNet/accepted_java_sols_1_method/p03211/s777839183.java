import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] arr = new int[s.length()];
        int k = 0;
        for (char c : s.toCharArray()) {
            arr[k++] = Character.getNumericValue(c);
          //System.out.println(Character.getNumericValue(c));
        }
        
        int res = Integer.MAX_VALUE;
        for (int i =0; i< s.length() - 2;i++) {
            int val = arr[i] * 100 +arr[i+1] * 10 +arr[i+2];
            res = Math.min(Math.abs(753-val), res);
        }
        System.out.println(res);
    }
}
