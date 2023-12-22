import java.util.*;
import java.util.ArrayDeque;
import java.util.Deque;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String line = sc.nextLine();
            if(line.equals(".")) break;
            Boolean ans = true;
            Deque<Character> deque = new ArrayDeque<Character>();
            for(int i = 0; i<line.length(); i++){
                char c = line.charAt(i);
                if(c == '(' || c == '[') deque.push(c);
                else if(c==')'){
                    if(deque.isEmpty()){
                        ans = false;
                        break;
                    }
                    char bef = deque.pop();
                    if(bef != '('){
                        ans = false;
                        break;
                    }
                }else if(c==']'){
                    if(deque.isEmpty()){
                        ans = false;
                        break;
                    }
                    char bef = deque.pop();
                    if(bef != '['){
                        ans = false;
                        break;
                    }
                }else if(c=='.'){
                    if(!(deque.isEmpty())){
                        ans = false;
                        break;
                    }
                }else{
                    continue;
                }
            }
            if(ans) System.out.println("yes");
            else System.out.println("no");
        }
        sc.close();
    }
}
