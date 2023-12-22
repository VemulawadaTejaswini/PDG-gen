import java.util.*;
public class Main{
	public static void main(String []args){
    	Scanner sc = new Scanner(System.in) ;
      	int n = sc.nextInt() ;
      	sc.nextLine() ;
      //	String s1 = sc.next() ;
      //	String s2 = sc.next() ;
      String s[] = sc.nextLine().split(" ") ;
      String s1 = s[0] ; 
      String s2 = s[1] ;
      
       String res = "" ;
      	for(int i = 0  ; i < s1.length() ; i++) {
        	res+=s1.charAt(i);
            res+=s2.charAt(i) ; 
        }
      System.out.println(res) ;
    }
}