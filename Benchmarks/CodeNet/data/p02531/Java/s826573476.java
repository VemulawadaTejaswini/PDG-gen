
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String order=br.readLine();
            ArrayDeque<Character> dq = new ArrayDeque<Character>();
            ArrayList<Character> al = new ArrayList<Character>();
            while(order.equals("quit")){
                String[] splited = order.split(" ");
                if(splited[0].equals("push"))
                    dq.addLast(splited[1].charAt(0));
                else{
                    char pulled = dq.pollLast();
                    al.add(pulled);
                }                
                order=br.readLine();
            }
            for(char ch : al)
                System.out.println(ch);
        }catch(Exception e){e.printStackTrace();}
    }
    static int count(int[] ns, int[] qs){
        int count=0;
        for(int i = 0; i<ns.length; i++){
            int n_i = ns[i];
            for(int j=0; j<qs.length; j++){
                if(n_i==qs[j]){count++; break;}
            }
        }
        return count;
    }
}