import java.util.LinkedList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int counter = 0;
        LinkedList<Integer> list = new LinkedList<>();
        for(int x = 0; x < n; x++){
            String check = scan.next();
            if(check.equals("insert")){
                int y = scan.nextInt();
                list.addFirst(y);
                counter++;
            }
            else if(check.equals("delete")){
                int y = scan.nextInt();
                if(list.remove((Integer) y)) {
                    counter--;
                }
            }
            else if(check.equals("deleteFirst")){
                list.pollFirst();
                counter--;
            }
            else{
                list.pollLast();
                counter--;
            }
        }
        for(int x = 0; x < counter; x++){
            if(x == counter - 1){
                System.out.println(list.poll());
            }
            else {
                System.out.print(list.poll() + " ");
            }
        }
    }
}
