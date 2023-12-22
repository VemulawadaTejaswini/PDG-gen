import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 文字列の入力
       List<String> list = Arrays.asList(sc.next().split(""));
       Collections.sort(list);
    
		// 出力
		System.out.println(list.get(0).equals(list.get(1))
       && list.get(2).equals(list.get(3)) && !list.get(1).equals(list.get(2)) ? "Yes" : "No");
	}
}