import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
		int b = sc.nextInt();
      	int c = sc.nextInt();
      
      	if(c-(a-b) > 0) System.out.println(c-(a-b));
      	else System.out.println(0);
    }
}