import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean followRulesFlg = true;
		ArrayList<String> stringsA = new ArrayList<>();
			
		for(int a = 0; a<N; a++){
			stringsA.add(sc.next());
		}
		sc.close();
		
		ArrayList<String> stringsB = new ArrayList<>(stringsA);
		Collections.sort(stringsB);
		
		for(int a = 0; a<stringsA.size()-1; a++){
			int b = a+1;
			if(stringsA.get(a).charAt(stringsA.get(a).length()-1)!=stringsA.get(b).charAt(0)){
				followRulesFlg=false;
				break;
			}
			if(stringsB.get(a).equals(stringsB.get(b))){
				followRulesFlg=false;
				break;
			}
		}
		System.out.println(followRulesFlg? "Yes" : "No");
	}
}