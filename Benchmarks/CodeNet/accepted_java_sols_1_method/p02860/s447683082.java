import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	String s=sc.next();
      	if(n%2==1){
          System.out.println("No");
        }else{
        	for(int i=0;i<n/2;i++){
             
            	if(s.charAt(i)==s.charAt(n/2+i)&&i<n/2-1){
                  continue;
                }else if(s.charAt(i)==s.charAt(n/2+i)){
                  	System.out.println("Yes");
                }else {
                	System.out.println("No");
                  	break;
                }
            }
        }
      	
      	
    }
}