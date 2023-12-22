import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	String str = sc.next();
      	Integer cnt = 0;
      	Integer tmp = 0;
		for(int i=0; i < str.length(); i++){
          char C = str.charAt(i);
          if(C=='A'){
			tmp++;
            continue;
          }
          if(C=='G'){
			tmp++;
            continue;
          }
          if(C=='C'){
			tmp++;
            continue;
          }
          if(C=='T'){
			tmp++;
            continue;
          }
          if(tmp > cnt){
            cnt = tmp;
          }  
          tmp = 0;
        }
      	if(tmp > cnt){
            cnt = tmp;
        }  
		System.out.println(cnt);
      	return;
	}
}
