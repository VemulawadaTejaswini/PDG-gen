import java.util.*;

public class Main {
 
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int kinds = sc.nextInt();
    int select = sc.nextInt();
    List<Integer> priceList = new ArrayList<Integer>();
    while (sc.hasNext()) {
      priceList.add(sc.nextInt());
    }
    
    Collections.sort(priceList);
    System.out.println(priceList.subList(0,select)
                       .stream()
                       .mapToDouble(a -> a)
                       .average()); 
  }
}