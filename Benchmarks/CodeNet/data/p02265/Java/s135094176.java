import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            Deque<Integer> dq = new ArrayDeque<Integer>();
            StringBuilder sb = new StringBuilder();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = sc.nextInt();
            for(int i = 0 ; i < n ; i++){
                String command = br.readLine();
                //if(command.contains("insert"))
                 //   dq.addFirst(Character.getNumericValue(command.charAt(7)));
                //else if(command.contains("deleteFirst"))
                //    dq.removeFirst();
                //else if(command.contains("deleteLast"))
                //    dq.removeLast();
                //else
                //    dq.remove(Character.getNumericValue(command.charAt(7)));
            }
        }catch(IOException e){}
    }
}
