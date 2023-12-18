import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner  scan=new Scanner(System.in);
         int x=scan.nextInt();
         int y=scan.nextInt();
          while(!(x==0&&y==0)){
          x=scan.nextInt();
          y=scan.nextInt();
        	  
    	  if(x<=y)
    		  System.out.println(x+" "+y);
          else
             System.out.println(x+" "+y);
    	   
          }
          
        
         
    }
 
}
