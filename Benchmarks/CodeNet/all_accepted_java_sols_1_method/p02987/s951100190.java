import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    List<String> arr = new ArrayList<String>();
    List<String> arr2 = new ArrayList<String>();
    int countx = 0;  
    int county = 0;  
    for(int i = 0; i < str.length(); i++) {
      String tmp = String.valueOf(str.charAt(i));
      arr2.add(tmp);
      if(arr.contains(tmp) == false){
        arr.add(tmp);
      }
    }
    if(arr.size() > 2){
      System.out.println("No");
      return;
    }
    String x = arr2.get(0);
    String y = arr2.get(1);
   
    for(int i = 0; i < str.length(); i++) {
      if(x.equals(String.valueOf(str.charAt(i)))){
      	countx++;
      }else{
        county++;
      }
    }
    if(countx != 2 || county != 2){     
		System.out.println("No");
      	return;
    }
	System.out.println("Yes");
  }
}
