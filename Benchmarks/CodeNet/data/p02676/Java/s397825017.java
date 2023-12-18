import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    	
    	int K = sc.nextInt();
    	String S = sc.nextString();
    	
    	if(S.length>K){
        	S = S.substring(0,K)
        	System.out.println(S);
        
        }
    
  }
}  
    