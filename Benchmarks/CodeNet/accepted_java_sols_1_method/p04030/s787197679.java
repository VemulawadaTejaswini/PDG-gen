import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        ArrayDeque<Character> dq = new ArrayDeque<>();
        for(int i =0; S.length() > i; i++){
            char c = S.charAt(i);
            if(c == 'B' && dq.isEmpty() == false){
                dq.removeFirst();
            }else if(c == 'B' && dq.isEmpty()){
            }else{
                dq.addFirst(c);
            }
        }
        while(dq.isEmpty() == false){
            System.out.print(dq.removeLast());
        }

    }

}