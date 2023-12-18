import java.util.*;
public class Main {
	public static void main(String[] args){
      
		Scanner sc = new Scanner(System.in);
      
        double w = sc.nextInt();
        double h = sc.nextInt();
        double x = sc.nextInt();
        double y = sc.nextInt();
        double ans = w*h/2;      
        if(x==w/2&&y==h/2){
           System.out.println(ans + " 1");        
        }else{
           System.out.println(ans + " 0");
        }
    }
}