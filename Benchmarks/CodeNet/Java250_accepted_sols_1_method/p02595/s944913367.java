import java.util.*;


public class Main {
	static int j =0;
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int x = sc.nextInt();
		 int y = sc.nextInt();
		 int c=0;
		 for(int i=0;i<x;i++) {
			 double a= sc.nextInt();
			 double b= sc.nextInt();
			 
			 if(Math.sqrt(a*a+b*b)<=y) {
				 c++;
			 }
		 }
		 System.out.println(c);
	}


}
