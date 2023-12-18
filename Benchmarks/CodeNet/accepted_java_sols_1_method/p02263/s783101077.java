import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.LongBinaryOperator;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] A = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        Map<String, LongBinaryOperator> map = new HashMap<String, LongBinaryOperator>() {
            {
                put("+", (a, b) -> a + b);
                put("-", (a, b) -> a - b);
                put("*", (a, b) -> a * b);
            }
        };
        Stack<Long> stack = new Stack<Long>();
        for(String s : A){
            if(map.containsKey(s)){
                long b = stack.pop();
                stack.push(map.get(s).applyAsLong(stack.pop(), b));
            }else{
                stack.push(Long.parseLong(s));
            }
        }
        System.out.println(stack.peek());
    }
}
