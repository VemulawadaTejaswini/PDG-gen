import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> remove = new ArrayList<>();

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        Collections.addAll(remove, a,b);
        
        list.removeAll(remove);

        for (Integer integer : list) {
          System.out.println(integer);
        }
      }

    }
}