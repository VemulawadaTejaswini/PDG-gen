import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        String str = sc.next();
        int count = 0;
        for (char c : str.toCharArray()) {
            count = count + Character.getNumericValue(c);
        }
        if (Integer.valueOf(str) % count == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}