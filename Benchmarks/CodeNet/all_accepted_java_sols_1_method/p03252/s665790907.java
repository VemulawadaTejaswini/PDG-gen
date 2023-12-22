import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String s = sc.next();
		String t = sc.next();
		int length = s.length();
		boolean[][] mapS = new boolean[26][length];
		boolean[][] mapT = new boolean[26][length];
		for (int i=0; i<26; i++){
			for (int j=0; j<length; j++){
				mapS[i][j] = false;
				mapT[i][j] = false;
			}
		} // 初期化する
	    	
		char x;
		int l=0;
		for (x = 'a'; x <= 'z'; x++) {
					// System.out.println(x+"c"+l);

			for(int i=0;i<length;i++){
				char sHead = s.charAt(i);
				char tHead = t.charAt(i);

					// System.out.println("i  "+i );
					// System.out.println("sHead "+sHead);
					// System.out.println("tHead "+tHead);
				if(sHead==x){
					mapS[l][i] = true;
					// System.out.println("s x i "+ l+i);
				}
				if(tHead==x){
					// System.out.println("t x i "+ l+i);
					mapT[l][i] = true;
				}
			}
			l++;
   		}


		Map<Integer, Boolean> avoidMap = new HashMap<>();
		boolean isSuccess =true;
   		for (int i=0; i<26; i++){
   			boolean sFlag = false;
			for (int j=0; j<26; j++){
				if(avoidMap.containsKey(j)){

					// System.out.println("avoidCase is "+j);
					continue;
				}

				boolean pairFlag=true;
				for(int k=0 ;k<length;k++){
					// System.out.println("i j k "+ i+j+k+mapS[i][k] + mapT[j][k]);
					if(mapS[i][k] != mapT[j][k]){
						pairFlag =false;
					}
				}

					// System.out.println("pairFlag is "+pairFlag);
				if(pairFlag){
					sFlag =true;
					avoidMap.put(j,true);
					break;
				}
			}

			if(sFlag){
				isSuccess =true;
			}else{
				// System.out.println("Failed in "+i);
				isSuccess =false;
				break;
			}
		}
		System.out.println(isSuccess?"Yes":"No");



	}


}


