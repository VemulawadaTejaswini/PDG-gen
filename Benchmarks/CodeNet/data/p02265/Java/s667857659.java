import java.io.*;
import java.util.*;



public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        str = br.readLine();
        int num = Integer.parseInt(str);
        
        LinkedList<Integer> list = new LinkedList<Integer>();

        for(int i=0;i<num;i++){
            str = br.readLine();
            String[] temp = str.split("\\s");
            String o = temp[0];
            //int n = Integer.parseInt(temp[1]);//don't have deleteFirst

            if(o.equals("insert")){
                list.addFirst(Integer.parseInt(temp[1]));
            }else if(o.equals("delete")){
                int j = list.indexOf(Integer.parseInt(temp[1]));
                if(j != -1){
                    list.remove(j);
                }
            }else if(o.equals("deleteFirst")){
                list.pollFirst();
            }else if(o.equals("deleteLast")){
                list.pollLast();
            }

        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i));
            if(i != list.size()-1){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
        br.close();
    }

}
