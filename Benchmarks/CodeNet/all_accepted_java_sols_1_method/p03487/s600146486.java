import java.util.*;
import java.util.stream.*;
import static java.util.Comparator.*;

public class Main{
  public static void main(String[] args) throws Exception{
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
    List<Integer> numList = new ArrayList<>();
    while(sc.hasNextInt()){
        numList.add(sc.nextInt());
    }
    Map<Integer,Integer> mp = new HashMap<>();
    for(int x : numList){
        Integer a = mp.get(x);
        if(a != null){
            mp.put(x,++a);
        }else{
            mp.put(x,1);
        }
    }
    int result = 0;
    for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
        int first = entry.getKey();
        int second = entry.getValue();
        if(first - second > 0){
            result += second;
        }else{
            result += second - first;
        }
    }
    System.out.println(result);
  }
}
