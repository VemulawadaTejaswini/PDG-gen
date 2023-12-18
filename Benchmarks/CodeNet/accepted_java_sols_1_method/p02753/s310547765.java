import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	String s = sc.next();
    if(s.equals("AAA") || s.equals("BBB")){
      System.out.println("No");
    }
    else
    {
      System.out.println("Yes");
    }
    //HashMap<String,Integer> map = new HashMap<String,Integer>();
    //LinkedList<String> array = new LinkedList<String>();
    //int max = 1;
    /*
    for(int i = 0; i < n; i++){
      String s = sc.next();
      int tmp = 1;
      if(map.containsKey(s)){
        tmp = map.get(s)+1;
      }
      map.put(s, tmp);
      
      if(tmp == max){
        array.add(s);
      } 
      else if(tmp > max){
        max = tmp;
        array.clear();
        array.add(s);
      }
    }
    */
    //array.sort(Comparator.naturalOrder());
    //for(String value : array)
	//{
      //System.out.println(value);
	//}
  }
}