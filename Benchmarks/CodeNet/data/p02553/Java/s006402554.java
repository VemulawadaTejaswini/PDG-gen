import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    
    int x=a*c;
    int y=a*d;
    int z=b*c;
    int w=b*d;
    
    if(x>=y&&x>=z&&x>=w)
    {
    	System.out.println(x); 
    }else {
    	if(y>=z&&y>=w) {
    		System.out.println(y);
    	}else {
    		if(z>=w) {
    			System.out.println(z);
    		}else {
    			System.out.println(w);
    		}
    	}
    }
  }
}