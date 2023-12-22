import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;
  
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //モンスターの体力
        //int H = Integer.valueOf(s.next());
        //社員番号
        int N = Integer.valueOf(s.next());
        //部下持ち数
        int[] Ai = new int[N+1];
        Arrays.fill(Ai, 0);
		for(int i = 0; i < N-1; i++) {
            int hoge = Integer.valueOf(s.next());
			Ai[hoge] += 1;
        }
        for(int i = 1; i < Ai.length; i++) {
            System.out.println(Ai[i]);
        }
    }
}