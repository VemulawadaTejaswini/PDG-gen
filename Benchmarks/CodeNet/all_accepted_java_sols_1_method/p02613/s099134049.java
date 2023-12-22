import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    List<String> list = new ArrayList<>();

    while (sc.hasNextLine()) {
      String str = sc.nextLine();
      list.add(str);
    }
    
    Map<String, List<String>> grp = list.stream().collect(Collectors.groupingBy(s -> s));
    
    System.out.println("AC" + " x "  +  grp.getOrDefault("AC", Collections.emptyList()).size());
    System.out.println("WA" + " x "  +  grp.getOrDefault("WA", Collections.emptyList()).size());
    System.out.println("TLE" + " x "  +  grp.getOrDefault("TLE", Collections.emptyList()).size());
    System.out.println("RE" + " x "  +  grp.getOrDefault("RE", Collections.emptyList()).size());

  }
}