import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> Stack = new ArrayDeque<>();
        String S = sc.nextLine();
        String list [] = S.split(" ");
        for(int i=0;i<list.length;i++){
            S = list[i];
            if(S.equals("+")){
                int n1 = Stack.pop();
                int n2 = Stack.pop();
                Stack.push(n1+n2);
            }
            else if(S.equals("-")){
                int n1 = Stack.pop();
                int n2 = Stack.pop();
                Stack.push(n2-n1);
            }
            else if(S.equals("*")){
                int n1 = Stack.pop();
                int n2 = Stack.pop();
                Stack.push(n1*n2);
            }
            else Stack.push(Integer.parseInt(S));
        }
        System.out.println(Stack.pop());
    }
}
