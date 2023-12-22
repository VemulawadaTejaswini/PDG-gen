import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		HashSet<String> hash = new HashSet<String>();
		int max = 0;

		for(int i=1; i<N; i++){
			String X = S.substring(0, i);
			String Y = S.substring(i, N);
			hash.clear();
			for(int j=0; j<X.length(); j++){
				String x = X.substring(j, j+1);
				if(Y.contains(x)){
					hash.add(x);
				}
			}
			if(hash.size()>max){
				max = hash.size();
			}
		}
		System.out.println(max);
	}
}
