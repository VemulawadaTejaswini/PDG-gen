import java.util.Iterator;
import java.util.Scanner;
import java.util.HashSet;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
		String S = sc.next();

		HashSet hs = new HashSet();
		for (int i = 0; i < N; i++){
			hs.add(S.charAt(i));
		}

		int cnt = 0;

	    	for(int j = 1; j <= N; j++){
	    		String s1 = S.substring(0, j);
	    		String s2 = S.substring(j);
//	    		System.out.println("j= "+ j +":"+ s1);
//	    		System.out.println("j= "+ j +":"+ s2);
	            Iterator it = hs.iterator();
	            int wkcnt = 0;
	            while (it.hasNext()) {
	            	String chr = it.next().toString();
//	            	System.out.println(chr);
	                if(s1.contains(chr) && s2.contains(chr)){
	                	wkcnt++;
	                }
	            }
	            cnt = Math.max(cnt, wkcnt);
	    	}



		System.out.println(cnt);

	}
}