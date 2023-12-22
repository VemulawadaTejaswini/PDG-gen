import java.util.*;
public class Main {
	public static void main(String[] args){
      boolean ok_flag = true;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      List<String> list = new ArrayList<>();
      for(int i=0; i<n; i++){
list.add(sc.next());
      }
Set<String> set = new HashSet<>(list);
List<String> list2 = new ArrayList<>(set);

 if(n!=list2.size()) {
   System.out.println("No");
   System.exit(0);
 }
      for(int i=1; i<list.size(); i++){
      String str_end = list.get(i-1);
      String str_str = list.get(i);
      char c_end = str_end.charAt(str_end.length()-1);
        char c_str = str_str.charAt(0);
        if(c_end != c_str) ok_flag = false;
      }
      if(ok_flag) System.out.println("Yes");
      else System.out.println("No");
	}
}
