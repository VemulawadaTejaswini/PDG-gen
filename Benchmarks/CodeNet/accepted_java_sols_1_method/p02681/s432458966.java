import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String S = in.next();
		String T = in.next();
		boolean onazi = true;
		boolean komozi = true;
		boolean mozisu = false;
    	boolean tuika = false;
    	
    	//条件
		for(int i=0; i<S.length(); i++){
			char a = S.charAt(i);
            char b = T.charAt(i);
            if(!(a == b)){
            	onazi = false;
            }
		}
    	for(int i=0; i<S.length(); i++){
            char x = S.charAt(i);
    		if(x >= 'A' && x <= 'Z') {
    			komozi = false;
    		}
    	}
    	for(int i=0; i<T.length(); i++){
			char x = T.charAt(i);
			if(x >= 'A' && x <= 'Z') {
    			komozi = false;
    		}
    	}
        if(1<=S.length() && S.length()<=10){
          mozisu = true;
        }
        if(T.length() == (S.length()+1)){
        	tuika = true;
        }
        
        //判定
        if(onazi && komozi && mozisu && tuika){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
	}
}