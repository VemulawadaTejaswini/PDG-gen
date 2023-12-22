import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] c = str.toCharArray();
		int A = str.length();
		int Z = 0;

		for(int i=0; i<str.length(); i++){
			String s = String.valueOf(str.charAt(i));
			if(s.equals("A")){
				if(A>i){
					A=i;
				}
			}else if(s.equals("Z")){
				if(Z<i){
					Z=i;
				}
			}
		}

		System.out.println(Z-A+1);
	}
 
}