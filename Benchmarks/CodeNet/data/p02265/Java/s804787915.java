import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        // TODO ?????????????????????????????????????????????
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
         
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            String[] strArray = br.readLine().split(" ");
            String inst = strArray[0];
             
            if(inst.equals("insert")){
                list.add(0, Integer.parseInt(strArray[1]));
            }
            else if(inst.equals("delete")){
                list.remove((Object)Integer.parseInt(strArray[1]));
            }
            else if(inst.equals("deleteFirst")){
                list.remove(0);
            }
            else if(inst.equals("deleteLast")){
                list.remove(list.size() - 1);
            }
        }
         
        printList(list);
    }
     
    static void printList(ArrayList list){
    	PrintWriter pw = new PrintWriter(System.out);
    	
        for(int i = 0; i < list.size() ; i++){
            pw.print(list.get(i));
            if(i != list.size() - 1){
                pw.print(" ");
            }
        }
        pw.println();
        pw.flush();
    }
 
}