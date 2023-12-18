import java.util.*;
import java.lang.Integer; 

public class Main {
  public static void main(String[] args){
    List<Integer> xList = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      xList.add(sc.nextInt());
    }
    for(int i=0;i < xList.size();i++){
      if(xList.get(i).compareTo(Integer.valueOf(0)) == 0){
    	System.out.println(i+1);
        break;
      }
    }
  }
}