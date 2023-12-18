import java.util.Scanner;

class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
 		String S = sc.next();
      	String T = sc.next();
      
      	int a = S.length();
        int b = T.length();
      
      	String c = S.substring(0,a);
      	String d = T.substring(0,a);
      
      	if(a + 1 == b){
        	if(c == d){
            	System.out.println("Yes");
            }else{
            	System.out.println("No");
            }}else{
        	System.out.println("No");
        }
    }
}