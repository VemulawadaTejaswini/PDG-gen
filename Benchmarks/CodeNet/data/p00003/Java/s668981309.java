import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
		 while(in.hasNext()){
			 int n,a,b,count=0,c;
			 
			 a=in.nextInt();
			 b=in.nextInt(); 
			 c=in.nextInt();
			 if(a*a+b*b==c*c||c*c+b*b==a*a||a*a+c*c==b*b)
			     System.out.println("YES");
			 else
				 System.out.println("NO");

		 }

	}
	

}