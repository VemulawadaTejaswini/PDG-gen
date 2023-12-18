import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    TreeMap<Integer,Integer> lastMonth = new TreeMap<Integer,Integer>();
    while(true) {
      String str = sc.nextLine();
      if (str.equals("")) {
        break;
      }
      int id = Integer.parseInt(str.split(",")[0]);
      if (lastMonth.containsKey(id)) {
        lastMonth.put(id,lastMonth.get(id)+1);
      }
      else {
        lastMonth.put(id,1);
      }
    }
    TreeMap<Integer,Integer> thisMonth = new TreeMap<Integer,Integer>();
    while(sc.hasNext()) {
      int id = Integer.parseInt(sc.next().split(",")[0]);
      if (thisMonth.containsKey(id)) {
        thisMonth.put(id,thisMonth.get(id)+1);
      }
      else {
        thisMonth.put(id,1);
      }
    }
    Iterator it = thisMonth.keySet().iterator();
    while (it.hasNext()) {
      Object id = it.next();
      if (lastMonth.containsKey((int)id)) {
        System.out.println(id + " " + (thisMonth.get(id)+lastMonth.get(id)));
      }
    }
  }
}