import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        ArrayList<String> sList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
          sList.add(sc.next());
        }
      
		int m = sc.nextInt();
        ArrayList<String> tList = new ArrayList<>();
        for(int i = 0; i < m; i++) {
          tList.add(sc.next());
        }
      
        int ans = 0;
        while(sList.size() != 0) {
          String target = sList.get(0);
          int count = 1;
          sList.remove(0);
          while(sList.indexOf(target) != -1) {
            count++;
            sList.remove(sList.indexOf(target));
          }
          while(tList.indexOf(target) != -1) {
            count--;
            tList.remove(tList.indexOf(target));
          }
          if (count > ans) {
            ans = count;
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}