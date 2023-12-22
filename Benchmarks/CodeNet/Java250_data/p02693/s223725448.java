import java.util.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
        int a = sc.nextInt();
		int b = sc.nextInt();
		
      	int divide = a/k;
      if (a%k==0) {System.out.println("OK");}
      else if (((divide+1)*k) <= b)
      {System.out.println("OK");}
      else {System.out.println("NG");}	
    
	}
}