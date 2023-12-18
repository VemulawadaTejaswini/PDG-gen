

import java.math.BigDecimal;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == '0'){
                stack.offerLast("0");
            }else if (s.charAt(i) == '1'){
                stack.offerLast("1");
            }else if (s.charAt(i) == 'B'){
                if (!(stack.isEmpty())){
                    stack.pollLast();
                }
            }
        }
        for (String b : stack){
            System.out.print(b);
        }
        System.out.println();
    }
}