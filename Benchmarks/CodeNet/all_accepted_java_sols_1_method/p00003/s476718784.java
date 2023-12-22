import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		int circle=input.nextInt();
		for(int i=0;i<circle;i++){
			int a=input.nextInt();
			int b=input.nextInt();
			int c=input.nextInt();
			
			if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}