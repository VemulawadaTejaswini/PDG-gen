import java.util.*;

public class Main{

  public static void main(String[] arg){
  		Scanner sc=new Scanner(System.in);
    
    	int n=sc.nextInt();
    	int m=sc.nextInt();
    
    	if(m>=n%500){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
  }
  
}