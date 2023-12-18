import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() ;
		int k = sc.nextInt();
		String s = sc.next();
      	int i ;
     
  		String[] str = s.split("");
		String temp = str[k-1];
      
      	String  answer[] = new String[n] ;
	
      	for(i = 0; i <= n-1 ; i++){
        	if(i == k-1){
              	answer[i] = temp.toLowerCase();
            }else{
              	answer[i] = str[i];
        	}
        }
      	String r = String.join("", answer);
      	System.out.println(r);
	}
}