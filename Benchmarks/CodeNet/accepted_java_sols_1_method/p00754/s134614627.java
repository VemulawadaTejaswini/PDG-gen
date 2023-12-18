import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String array = "";
        Deque<Character> left = new ArrayDeque<>();
        Deque<Character> right = new ArrayDeque<>();
        array = sc.nextLine();
        boolean isClear = true;

        while(!array.equals(".")){
            for( int i = 0; i < array.length(); i++) {
                if(array.charAt(i) == '(' || array.charAt(i) == '['){
                    left.push(array.charAt(i));
                }else if(array.charAt(i) == ')' || array.charAt(i) == ']'){
                    right.push(array.charAt(i));
                    if(!left.isEmpty()){
                        if((right.peek() == ')' && left.peek() == '(') ||
                            (right.peek() == ']' && left.peek() == '[')){
                            right.pop();
                            left.pop();
                        }else{
                            isClear = false;
                            break;
                        }
                    }
                }
            }
            if(left.isEmpty() && right.isEmpty() && isClear){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

            right.clear();
            left.clear();
            isClear = true;
            array = sc.nextLine();
        }
        
        sc.close();
    }
}
