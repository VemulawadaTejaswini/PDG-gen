import java.util.*;
class Main{
  public static void main(String[] args){
  	int x = 0;
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    
    for(int i = 0; i < (N - 2); i++){
    	if( S.charAt(i) == 'A' && S.charAt(i+1) == 'B'){
        	if(S.charAt(i+2) == 'C'){
            	x += 1;
            }
          
        }
      
    }
    System.out.println(x);
  
  }
}
