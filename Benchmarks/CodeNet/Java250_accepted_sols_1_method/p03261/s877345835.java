import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> listFirst = new ArrayList<String>();
		ArrayList<String> listLast = new ArrayList<String>();
		boolean ng = false;
		
		for (int i = 0; i < N; i++) {
			String w = sc.next();
			if (!ng){
				ng = list.contains(w);				
			}
			list.add(w);
			listFirst.add(w.substring(0,1));
			listLast.add(w.substring(w.length()-1));
		}
		if (ng) {
			System.out.println("No");									
			return;
		}
		for (int i = 1; i < N; i++) {
			String f = listLast.get(i-1);
			String l = listFirst.get(i);
			if (!f.equals(l)) {
				ng = true;
				break;
			}
		}
		if(ng){
			System.out.println("No");						
		} else {
			System.out.println("Yes");						
		}
		
		
		// 入力
		/*
		String S = sc.next();                
		String T = sc.next();                
		
		for (int i = 0; i < S.length(); i++) {
			if (!S.substring(i,i+1).equals(T.substring(i,i+1))) {
				if (S.indexOf(T.substring(i,i+1)) == -1) {
					S = S.replace(S.substring(i,i+1), T.substring(i,i+1));
				} else {
					String s = S.substring(0, S.length());
					StringBuilder sb = new StringBuilder("");
					for (int j = 0; j < s.length(); j++) {
						if (s.substring(j, j+1).equals(S.substring(i, i+1))) {
							sb.append(T.substring(i, i+1));
						} else if (s.substring(j, j+1).equals(T.substring(i, i+1))) {
							sb.append(S.substring(i, i+1));							
						} else {
							sb.append(s.substring(j, j+1)); 
						}
					}
					S = sb.toString();
				}
			}
		}
		if(S.equals(T)){
			System.out.println("Yes");			
		} else {
			System.out.println("No");			
		}
	*/
	}	
}
