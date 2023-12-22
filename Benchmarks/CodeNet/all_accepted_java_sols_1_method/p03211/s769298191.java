import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
 
		String s = sc.next();
		int ans =753;
		
		for(int i=0; i<s.length()-2; i++){
		    String a = s.substring(i,i+3);
		    int b = Integer.parseInt(a) - 753;
		    int sa = Math.abs(b);
		    if(sa<ans){
		        ans =sa;
		    }
		}
 
		System.out.println(ans);
    }
}
