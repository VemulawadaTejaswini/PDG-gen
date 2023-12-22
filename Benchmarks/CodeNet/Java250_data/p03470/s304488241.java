import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();
    int num = sc.nextInt();
    
    while(sc.hasNext()){
      list.add(sc.nextInt());
    }
    
    List<Integer> ansList = list.stream().distinct().collect(Collectors.toList());
    System.out.println(ansList.size());
  }
}  