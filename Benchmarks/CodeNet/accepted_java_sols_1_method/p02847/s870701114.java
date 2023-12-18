import java.util.*;
public class Main{
public static void main(String[] args){
Map<String,Integer> map=new HashMap<>(7);
  map.put("MON",1);
  map.put("TUE",2);
  map.put("WED",3);
  map.put("THU",4);
  map.put("FRI",5);
  map.put("SAT",6);
  map.put("SUN",7);
  Scanner s=new Scanner(System.in);
  String in=s.next();
  String sun="SUN";
  if(in.equals(sun))
    System.out.println(7);
  else
    System.out.println(7-map.get(in));
}
}