import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String ans = "No";
    
		// 文字列の入力
        ArrayList<String> sList = new ArrayList<>();
        sList.addAll(Arrays.asList(sc.next().split("")));
        String t = sc.next();
      
        for(int i = 0; i < sList.size(); i++) {
          String value = sList.get(0);
          sList.remove(0);
          sList.add(value);
          StringBuilder builder = new StringBuilder();
          for(String s : sList) {
            builder.append(s);
          }
          String s = builder.toString();
          if (s.equals(t)) {
            ans = "Yes";
            break;
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}