import java.util.*;
public class Main{


	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		long s  =sc.nextLong();
		long w  =sc.nextLong();
		long c  =sc.nextLong();
		long d  =sc.nextLong();
	  int i  =-1; 
		while(true) {
i++;
			if(i%2==0) {
				c-=w;
				if(c<=0) {
					System.out.println(" Yes");
break;
				}
				
			}else {
				s-=d;
				if(s<=0) {
				System.out.println("No");
				break;}
			}
			
		
		}
	}

}
