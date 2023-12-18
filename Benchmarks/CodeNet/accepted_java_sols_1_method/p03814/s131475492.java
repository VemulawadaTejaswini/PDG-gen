import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 文字列の入力
        List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList(sc.next().split("")));
        int aIndex = list.indexOf("A");
        int zIndex = 0;
        for(int i = aIndex + 1; i < list.size(); i++) {
          if (list.get(i).equals("Z")) {
            zIndex = i;
          }
        }
    
		// 出力
		System.out.println(zIndex - aIndex + 1);
	}
}