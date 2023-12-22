import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String str = sc.nextLine();
    List<String> strList = Arrays.asList(str.split(" "));
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    for(int i = 0; i < n - 2; i++){
      	List<Integer> tmp = new ArrayList<Integer>();
      	tmp.add(Integer.parseInt(strList.get(i)));
      	tmp.add(Integer.parseInt(strList.get(i+1)));
      	tmp.add(Integer.parseInt(strList.get(i+2)));
      	list.add(tmp);
    }
    int count = 0;
    for(int i = 0; i < list.size(); i++){
      List<Integer> tmp = list.get(i);
      if(test(tmp, tmp.get(1)) == true){
        count++;
      }
    }
    System.out.print(count);
  }
  public static boolean test(List<Integer> list, int secondElem){
  	boolean ret = false;
    Collections.sort(list);
    if(list.get(1) == secondElem){
      if(list.get(1) != list.get(0) && list.get(1) != list.get(2)){
	    ret = true;
      }
    }
    return ret;
  }
}