import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      int num = Integer.parseInt(s.next());
      ArrayList<Integer> lis = new ArrayList<Integer>();
      for(int i = 0; i < num; i++){
        lis.add(Integer.parseInt(s.next()));
      }
      int sum = 0;
      for(int i = 0; i < num; i++){
        for(int j = i+1; j < num; j++){
          sum += lis.get(i)*lis.get(j);
        }
      }
      System.out.plintln(sum%(Math.pow(10, 9) + 7));
}