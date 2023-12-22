import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        char[] c = s.toCharArray();

        int count = 0;

        Deque<Character> deque = new ArrayDeque<>();
        for(int i = 0;i<n;i++){
            if(deque.peekFirst() == null){
                deque.addFirst(s.charAt(i));
            }else{
                if(deque.peekFirst() == s.charAt(i)){
                    deque.addFirst(s.charAt(i));
                }
                else{
                    deque.removeFirst();
                    count++;
                }
            }
        }

        System.out.println(count * 2);
    }
}