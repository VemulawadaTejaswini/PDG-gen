import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        
    	int x = sc.nextInt();
    	int y = sc.nextInt();
    	int j=1,z;
    	while(j<=x||j<=y){
    		if(x>=y){
    			z=x;
    			x=y;
    			y=z;
    		}
    		 System.out.println(x+" "+y);
    	   x = sc.nextInt();
    	   y = sc.nextInt();
    		}
 
    	
        sc.close();
}
}

