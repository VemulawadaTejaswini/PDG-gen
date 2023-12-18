import java.util.*;
 
public class Main {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.nextLine();
        ArrayDeque<Integer> seq = new  ArrayDeque<Integer>(2000000);
        String command;
        Integer num = 0;
        while(s.hasNext()){
            String input = s.nextLine();
            String[] input_array = input.split(" ");
            if(input_array.length == 1){
                command = input_array[0];
            }
            else{
                command = input_array[0];
                num = Integer.parseInt(input_array[1]);
            }
            if(command.equals("insert")){
                seq.addFirst(num);
            }
            else if(command.equals("delete")){
                seq.remove(num);
            }
            else if(command.equals("deleteFirst")){
                seq.removeFirst();
            }
            else if(command.equals("deleteLast")){
                seq.removeLast();
            }
        }
        while(seq.size() > 0){
        	if(seq.size() == 1){
                System.out.print(seq.poll() + "\n");
        	}
        	else{
                System.out.print(seq.poll() + " ");
        	}
        }
    }
}