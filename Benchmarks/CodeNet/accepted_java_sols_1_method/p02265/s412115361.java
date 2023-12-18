import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder ans = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
     	Deque<String> doubly_linked_list = new ArrayDeque<String>();
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            if (line[0].equals("insert")) {
                doubly_linked_list.addFirst(line[1]);
            } else if (line[0].equals("delete")) {
                doubly_linked_list.remove(line[1]);
            } else if (line[0].equals("deleteFirst")) {
                doubly_linked_list.removeFirst();
            } else if (line[0].equals("deleteLast")) {
                doubly_linked_list.removeLast();
            }
        }
		if(!doubly_linked_list.isEmpty()){
			ans.append(doubly_linked_list.getFirst());
			doubly_linked_list.removeFirst();
		}
		
		while(!doubly_linked_list.isEmpty()){
			ans.append(" ").append(doubly_linked_list.getFirst());
			doubly_linked_list.removeFirst();
		}
        System.out.println(ans.toString());
    }
}
