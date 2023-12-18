import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(scan.readLine());
        LinkedList<Integer> list = new LinkedList<>();
        int counter = 0;
        for(int x = 0; x < n; x++){
            String check = scan.readLine();
            if(check.startsWith("insert")){
                int y = Integer.parseInt(check.substring(check.indexOf(" ")+1));
                list.addFirst(y);
                counter++;
            }
            else if(check.startsWith("delete")){
                int y = Integer.parseInt(check.substring(check.indexOf(" ")+1));
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
