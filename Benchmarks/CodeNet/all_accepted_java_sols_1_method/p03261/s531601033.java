import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();



		Map<String, Boolean> wMap = new HashMap<>();
		boolean isRuled = true;
		String previousLastWord = "";
		for(int i=0;i<n;i++){
				String w = sc.next();
				// System.out.println(w);
				if(wMap.containsKey(w)){
					// System.out.println("containsKey");
					isRuled=false;
					break;
				}
				// System.out.println(w.substring(0,1));
				// System.out.println(previousLastWord);
				// System.out.println(w.substring(0,1).equals(previousLastWord));

				if(i>0 && !w.substring(0,1).equals(previousLastWord)){

					// System.out.println("equals");
					isRuled=false;
					break;
				}

				wMap.put(w,true);

				previousLastWord = w.substring(w.length()-1,w.length());
		}

		if(isRuled){
		System.out.println("Yes");
		}else{
		System.out.println("No");
		}

	}
}