import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		String T = sc.next();
		HashMap<String, String> mapS = new HashMap<String, String>();
		HashMap<String, String> mapT = new HashMap<String, String>();
		boolean ans = true;
		
		for(int i = 0; i < S.length(); i++){
			String cs = "" + S.charAt(i);
			String ct = "" + T.charAt(i);
			
			if(mapS.containsKey(cs)){
				if(!ct.equals(mapS.get(cs))){
					ans = false;
					break;
				}
			}else mapS.put(cs, ct);
			
			if(mapT.containsKey(ct)){
				if(!cs.equals(mapT.get(ct))){
					ans = false;
					break;
				}
			}else mapT.put(ct, cs);
		}
		
		System.out.println(ans?"Yes":"No");
	}
}