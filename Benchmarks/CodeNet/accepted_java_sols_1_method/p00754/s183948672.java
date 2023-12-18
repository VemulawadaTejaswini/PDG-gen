import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            boolean y_or_n = true;
            String str = sc.nextLine();
            if(str.equals(".")){
                break;
            }
            Stack<Character> st = new Stack<>();
            for(int i = 0; i < str.length(); i++){
                char c = str.charAt(i);
                if(c == '('){
                    st.push(c);
                }
                if(c == ')'){
                    if(st.empty() || st.pop() != '('){
                        y_or_n = false;
                    }
                }
                if(c == '['){
                    st.push(c);
                }
                if(c == ']'){
                    if(st.empty() || st.pop() != '['){
                        y_or_n = false;
                    }
                }
            }
            if(st.empty() && y_or_n){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
        sc.close();
    }
}
