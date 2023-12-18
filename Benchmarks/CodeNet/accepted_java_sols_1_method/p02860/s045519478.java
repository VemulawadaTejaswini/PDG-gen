import java.util.*;

public class Main{
	
  public static void main(String[] args){
  		Scanner s=new Scanner(System.in);
   		int n=s.nextInt();
    	String str = s.next();
    	if(n%2!=0){
        	System.out.println("No");
        }else{
        	for(int i=0;i<n/2;i++){
            	if(str.charAt(i)!=str.charAt(n/2+i)){
                	System.out.println("No");
                  return;
                }
            }
          System.out.println("Yes");
        }
  }
  
}