import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String line2 = br.readLine();
        String[] ary = line2.split(" ");
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<ary.length;i++) {
          list.add(new Integer(ary[i]));
        }
        Collections.reverse(list);
        for(int i=0;i<list.size();i++) {
           System.out.print(list.get(i));
           if(i==list.size()-1) {
             System.out.println();
           }else {
             System.out.print(" ");
           }
        }
    }
}