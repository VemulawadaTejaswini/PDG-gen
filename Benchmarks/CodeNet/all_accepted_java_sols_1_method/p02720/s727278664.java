import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		int K = Integer.parseInt(W);

		int indx = 0;
		long ans = 1;
		ArrayList<Long> list = new ArrayList<>();

		for(int i=1;i<10;i++){
			list.add((long)i);
		}
		long tmp ;
		int lastNum = 0;
		String tmpS ;
		while(list.size() < K){
			tmp = list.get(indx);
			//下一桁を取得
			tmpS = String.valueOf(tmp);
			lastNum=9-('9' - tmpS.charAt(tmpS.length()-1));
			if(lastNum!=0){
				list.add(tmp*10+lastNum-1);
			}
			list.add(tmp*10+lastNum);
			if(lastNum!=9){
				list.add(tmp*10+lastNum+1);
			}
			indx++;
		}

		Collections.sort(list);

		System.out.println(list.get(K-1));



//		HashMap<String,Boolean> map = new HashMap<String,Boolean>();
//		map.put("0", true);
//		map.put("00", true);
//		while(C < K){
//			String S=String.valueOf(ans);
//			if(S.length()==1){
//				C++;
//				map.put(S,true);
//				if(S.charAt(0)==1){
//					map.put("0"+S, true);
//				}
//			}else if(Math.abs(('9'-S.charAt(0))-('9'-S.charAt(1)))<=1){
//				if(map.containsKey(S.substring(1,S.length()))){
//					C++;
//					map.put(S, true);
//					if(S.charAt(0)==1){
//						map.put("0"+S, true);
//					}
//				}
////				}else{
////					if(S.charAt(1)=='0'&&(S.charAt(2)=='0'||S.charAt(2)=='1')){
////						//100の場合に00が存在しない扱いになるため
////						C++;
////						map.put(S, true);
////						map.put(S.substring(1,S.length()), true);
////
////					}
////
////				}
//			}
//			ans++;
//
//		}
//		System.out.println(ans-1);

	}
}
