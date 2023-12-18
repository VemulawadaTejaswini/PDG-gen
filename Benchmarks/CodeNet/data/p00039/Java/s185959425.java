import java.util.*;

// String
public class Main {
	public static void main(String[] args) {
		new Main().AOJ0039();
	}
	
	Scanner sc = new Scanner(System.in);
	void AOJ0039(){	// ローマ数字 -> 10進数
		HashMap<Character,Integer> dic = new HashMap<Character,Integer>();
		dic.put('I', 1);	dic.put('V', 5);	dic.put('X', 10);	dic.put('L', 50);
		dic.put('C', 100);	dic.put('D', 500);	dic.put('M', 1000);
		while(sc.hasNext()){
			char[] c = sc.next().toCharArray();
			int ans=0,last=dic.get(c[0]);
			for(int i=0; i<c.length; i++){
				if(last>=dic.get(c[i])){
					ans+=dic.get(c[i]);
					last=dic.get(c[i]);
				}else{
					ans+=dic.get(c[i])-last-last;
					last=dic.get(c[i]);
				}
			}
			System.out.println(ans);
		}
	}
	
	void AOJ0020(){	// 大文字変換
		while(sc.hasNext())	System.out.println(sc.nextLine().toUpperCase());
	}
	
}