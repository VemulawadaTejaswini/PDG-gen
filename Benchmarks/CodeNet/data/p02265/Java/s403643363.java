import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;


public class Main{
    public static void main(String[] args){
        Scannr sc = new Scanner(System.in);
        int num = sc.nextInt();
        Deque<Integer> deque = new ArrayDeque<Integer>();
        
        String str = "";
        int input = 0;
        for(int i =0; i < num; i++){
            str = sc.next();
            if(str.equals("insert")){
                input = sc.nextInt();
                deque.addFirst(input);
            }else if(str.equals("delete")){
                input = sc.nextInt();
                deque.removeFirstOccurrence(input);
            }else if(str.equals("deleteFirst")){
                deque.removeFirst();
            }else{
                deque.removeLast();
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
