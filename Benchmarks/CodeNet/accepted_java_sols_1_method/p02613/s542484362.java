import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = Integer.valueOf(sc.nextInt());
    
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("AC", 0);
    map.put("WA", 0);
    map.put("TLE", 0);
    map.put("RE", 0);    

    while(sc.hasNext()) {
      String str = sc.nextLine();
      if (map.containsKey(str)) {
        map.put(str, map.get(str)+1);
      }
    }

    System.out.println("AC x "+ map.get("AC"));
    System.out.println("WA x "+ map.get("WA"));
    System.out.println("TLE x "+ map.get("TLE"));
    System.out.println("RE x "+ map.get("RE"));

    sc.close();
  }
}