import java.util.*;
public class Main {
	public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        // 文字列の入力
        String s = sc.next();
        String[] comp = s.split("");

        // バス運行判定
        if (comp[0].equals(comp[1]) && comp[1].equals(comp[2])) {

            // バスの運航無(No出力)
		    System.out.println("No");
        } else {

            // バスの運航無(Yes出力)
		    System.out.println("Yes");
        }
	}
}