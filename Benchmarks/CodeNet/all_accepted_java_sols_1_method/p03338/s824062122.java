import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
	      		String S = sc.next();
	      		char[] c = S.toCharArray();
	      		char[] X = null, Y=null;
	      		int count = 0;
	      		int ans = 0;
	      		HashSet<String> a = new HashSet<String>();

	      		for(int i=1; i<N; i++){
	      			X = Arrays.copyOfRange(c, 0, i);
	      			Y = Arrays.copyOfRange(c, i, N);
	      			//System.out.println(Arrays.toString(X));
	      			//System.out.println(Arrays.toString(Y));
	      			count=0;
	      			a.clear();
	      			for(int j=0; j<X.length; j++){
	      				String x = String.valueOf(X[j]);
	      				String y = new String(Y);
	      				if(!(a.contains(x))){
	      					if(y.contains(x)){
	      						count++;
	      					}
	      					a.add(x);
	      				}

	      			}
	      			if(ans<count){
	      				ans = count;
	      			}
	      		}
	      		System.out.println(ans);
	}

}