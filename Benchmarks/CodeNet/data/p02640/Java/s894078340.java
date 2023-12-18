import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
      
      if(x==0){
        if(y==0){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
      }else{
        if(y%2==0){
          if((y/2) >= x && (y/4) <= x){
            System.out.println("Yes");
          }else{
            System.out.println("No");
                  }
        }else{
          System.out.println("No");
        }
      }
		
	}
}