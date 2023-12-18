import java.util.LinkedList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int x = 0; x < n; x++){
            String check = scan.next();
            if(check.equals("insert")){
                int y = scan.nextInt();
                list.addFirst(y);
            }
            else if(check.equals("delete")){
                int y = scan.nextInt();
                list.remove((Integer) y);
            }
            else if(check.equals("deleteFirst")){
                list.pollFirst();
            }
            else{
                list.pollLast();
            }
        }
        while (!list.isEmpty()){
         System.out.print(list.poll() + " ");
        }
        System.out.println("");
    }
}
