import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
      	String S = sc.next();	
      	String T = sc.next();
		int cnt = 0;

		String[] S2 = S.split("", 0);
		String[] T2 = T.split("", 0);
      	
	   	for(int i  = 0;i<3;i++){
          	if(S2[i].equals(T2[i]) ){
              	cnt++;
            }
        }
      	
      	System.out.println(cnt);
	}
}