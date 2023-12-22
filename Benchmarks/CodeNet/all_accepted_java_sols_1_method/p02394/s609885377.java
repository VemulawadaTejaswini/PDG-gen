import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int w=sc.nextInt();
        int h=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int r=sc.nextInt();
        
        if(r>x)
        {
         System.out.println("No");
        }
        else if(r>y){
        	System.out.println("No");
        }
        else if((x+r)>w){
        	System.out.println("No");
        }
        else if((y+r)>h){
        	System.out.println("No");
        }
        else{
        	System.out.println("Yes");
        }
        	
        	
        
        	
       sc.close();        
      
    }
}