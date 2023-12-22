import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<String> W = new ArrayList<String>();

		for(int i=0; i<N; i++){
			String w = sc.next();
			if(i>0){
				if(W.contains(w)){
					System.out.println("No");
					return;
				}
				String str1 = w.substring(0,1);
				String str2 = W.get(i-1).substring(W.get(i-1).length()-1);
				if(!(str1.equals(str2))){
					System.out.println("No");
					return;
				}
			}
			W.add(w);
		}
		System.out.println("Yes");
	}
}
