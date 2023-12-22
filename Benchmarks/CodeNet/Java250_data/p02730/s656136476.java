import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
  	int l = s.length();
  	if(l/2==0) System.exit(0);
  	if((l<3)||(99<l)) System.exit(0);
  
  	if (kaibunCheck(s)) {
      if (kaibunCheck(s.substring(0,(l-1)/2))) {
        if (kaibunCheck(s.substring((l+3)/2-1,l))) {
        	System.out.println("Yes");
          	System.exit(0);
      	}
      }
    }
      System.out.println("No");
	}
  
public static boolean kaibunCheck(String str){
  	int len = str.length();
  	char[] c = new char[len];
  	for(int i=0;i<len;i++){
      c[i] = str.charAt(i);
    }
  	for(int j=0;j<len;j++){
      if(c[j]!=c[len-j-1]) return false;
    }
  	return true;
}
}
