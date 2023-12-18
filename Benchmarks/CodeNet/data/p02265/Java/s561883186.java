import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;


public class Main{
    public static void main(String[] args){
        Scanenr sc = new Scanner(System.in);
        int num = sc.nextInt();
        Deque<Integer> deque = new ArrayDeque<Integer>();
        
        String str = "";
        int input = 0;
        for(int i =0; i < num; i++){
            str = next();
            if(str.equals("insert")){
                input = nextInt();
                deque.addFirst(input);
            }else if(str.equals("delete")){
                input = nextInt();
                deque.deleteFirstOccurrence(input);
            }else if(str.equals("deleteFirst")){
                deque.deleteFirst();
            }else{
                deque.deleteLast();
            }
        }
        StringBuilder output = new StringBuilder();
        output.append(deque.pollFirst);
        for(int x: deque){
            output.append(" " + x);
        }
        System.out.println(output);
    }
}
