import java.util.*;
public class Main {
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
    HashMap<String,Integer> map = new HashMap<String,Integer>();
	int n = sc.nextInt();
    boolean f = true;
    for (int i=0; i< n;i++) {
      int a = sc.nextInt();
      if (map.containsKey(""+a)) {
        f = false;
        break;
      }
      map.put(""+a,new Integer(a));
    }
    if (f){
  	System.out.print("YES");  
    } else {
  	System.out.print("NO");  

    }
  }
}






