import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
       
        ArrayList<String> sList = new ArrayList<>();
      
		for (int i = 0; i < n; i++) {
          String s = sc.next();
          String[] chars = s.split("");
          Arrays.sort(chars);
          String master = "";
          for (String part : chars) {
            master += part;
          }
          sList.add(master);
        }
        Collections.sort(sList);
       
        long ans = 0;
        while (sList.size() > 1) {
          String sample = sList.get(0);
          sList.remove(0);
          long count = 0;
          while(sList.get(0).equals(sample)) {
            ans++;
            count++;
            sList.remove(0);
            if (count > 1) {
            ans += count - 1;
            }
            if (sList.size() == 0) {
              break;
            }
          }
        }      
    
		// 出力
		System.out.println(ans);
	}
}