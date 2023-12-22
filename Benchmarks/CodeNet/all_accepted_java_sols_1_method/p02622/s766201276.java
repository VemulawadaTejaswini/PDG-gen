import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int count = 0;
		String S = sc.next();  
        String T = sc.next();  
        String[] SS = S.split("");
        String[] TT = T.split(""); 
        for (int i = 0; i < SS.length; i++) {
          if(!SS[i].equals(TT[i])){
            SS[i] = TT[i];
            count = count + 1;
          }
        }
        
		System.out.println(count);
	}
}