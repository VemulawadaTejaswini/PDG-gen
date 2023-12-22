import java.util.*;
import java.util.Collections;
public class Main {
	public static void main(String[] args){
 
      Scanner sc = null;
      sc = new Scanner(System.in);
      int N = sc.nextInt();
      int K = sc.nextInt();
      long sumPrice = 0;
      ArrayList<Integer> pList = new ArrayList<Integer>();
      while(sc.hasNextInt()){
        pList.add(sc.nextInt());
      }
      Collections.sort(pList);
      for(int i=0; i < K; i++){
        sumPrice += pList.get(i);
      }
      System.out.println(sumPrice);
    }
}