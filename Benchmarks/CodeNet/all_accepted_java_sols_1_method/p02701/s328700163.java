import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<String> s = new HashSet<String>();
      
        for (int i=0; i<N; i++) {
            String a = sc.next();
          s.add(a);
        }        
		// 文字列の入力
		System.out.println(s.size());
	}
}