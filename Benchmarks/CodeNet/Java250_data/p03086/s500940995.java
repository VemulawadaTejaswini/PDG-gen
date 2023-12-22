import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String str = sc.next();
      int a = 0;
      int result = 0;
      for(int i = 0;i < str.length();i++){
      	a = getLength(str,i,0);
        result = Math.max(a,result);
      }
      System.out.println(result);
    }
  
  	public static int getLength(String s,int n,int total){
      if(n >= s.length()){
      	return total;
      }
      char x = s.charAt(n);
      if(x=='A'||x=='C'||x=='G'||x=='T'){
      	return getLength(s,n+1,total)+1;
      }else{
      	return total;
      }
    }
}