import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ST = sc.next();
        StringBuilder S = new StringBuilder(ST);
		
		for(int i=0; i<S.length(); i++){
		    if(S.charAt(i) == '?'){
		        if(S.charAt(i-1) == 'P'){
		            S.setCharAt(i,'D');
		        }else if(S.charAt(i-1) == 'D'){
		            S.setCharAt(i,'P');
		        }
		    }
		}
		
		System.out.println(S);
    }
}
