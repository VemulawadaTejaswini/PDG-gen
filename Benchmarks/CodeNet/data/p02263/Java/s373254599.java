import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sarray = br.readLine().split(" ");
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for(int i = 0; i < sarray.length; i++){
            if(isNum(sarray[i])){
                stack.push(Integer.parseInt(sarray[i]));
            } else {
                int n = stack.pop();
                int m = stack.pop();
                if(sarray[i].equals("+"))stack.push(m + n);
                if(sarray[i].equals("-"))stack.push(m - n);
                if(sarray[i].equals("*"))stack.push(m * n);
                if(sarray[i].equals("/"))stack.push(m / n);
            }
        }
        System.out.println(stack.pop());
    }
    
    public static boolean isNum(String str){
        try{
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
};
