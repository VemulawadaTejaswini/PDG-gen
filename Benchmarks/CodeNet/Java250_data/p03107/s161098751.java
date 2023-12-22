import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        ArrayDeque<Character> dq = new ArrayDeque<>();
        int count = 0;

        for(int i =0; S.length() > i; i++){
            char c = S.charAt(i);
            if(dq.isEmpty() || dq.getFirst() == c){
                dq.addFirst(c);
            }else{
                dq.removeFirst();
                count++;
            }
            
        }
        System.out.println(count*2);

    }

}