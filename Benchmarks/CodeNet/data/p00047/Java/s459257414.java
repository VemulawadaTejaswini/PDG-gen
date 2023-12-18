import java.util.*;
import java.awt.Point;

 
class Main{
   public static void main(String arg[]) throws java.io.IOException{
       Scanner scan =new Scanner (System.in);
       HashMap<String,Boolean> cup =new HashMap<String,Boolean>();
       cup.put("A",true);
       cup.put("B", false);
       cup.put("C",false);
       scan.useDelimiter(",|\\r\\n");
       while(scan.hasNext()){
    	   String fst = scan.next();
    	   String snd = scan.next();
    	   cup.put(fst,cup.get(fst)^cup.get(snd));
    	   cup.put(snd,cup.get(fst)^cup.get(snd));
    	   cup.put(fst,cup.get(fst)^cup.get(snd));
       }
       if(cup.get("A"))System.out.println("A");
       else if(cup.get("B"))System.out.println("B");
       else System.out.println("C");

}
}
       