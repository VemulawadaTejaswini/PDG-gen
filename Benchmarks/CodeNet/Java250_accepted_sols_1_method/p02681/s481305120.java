import java.util.Scanner;

class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
 		String S = sc.next();
      	String T = sc.next();
      
      	int a = S.length();
       	String b = T.substring(0,a);
 
      if(S.equals(b)){
      	System.out.println("Yes");
      }else{
      	System.out.println("No");
      }
    }
}