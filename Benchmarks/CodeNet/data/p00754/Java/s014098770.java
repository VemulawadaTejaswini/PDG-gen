import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            boolean state=true;
            Deque<Integer> stack = new ArrayDeque<>();
            String s = sc.nextLine();
            if(s.equals("."))break;
            for(int i=0;i<s.length();i++){
                switch(s.charAt(i)){
                    case '(':
                        stack.addFirst(1);
                        break;
                    case '[':
                        stack.addFirst(2);
                        break;
                    case ')':
                        if(stack.isEmpty()||stack.removeFirst()!=1)state=false;
                        break;
                    case ']':
                        if(stack.isEmpty()||stack.removeFirst()!=2)state=false;
                        break;
                }
            }
            if(state)System.out.println("yes");
            else System.out.println("no");
        }
    }
}

