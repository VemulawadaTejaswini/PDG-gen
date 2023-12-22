import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c5=0;
		int c7=0;
		int a=sc.nextInt();
		if(a==7) c7++;
		else if(a==5) c5++;
		
		int b=sc.nextInt();
		if(b==7) c7++;
		else if(b==5) c5++;
		
		int c=sc.nextInt();
		if(c==7) c7++;
		else if(c==5) c5++;
		
		if(c5==2&&c7==1) System.out.println("YES");
		else System.out.println("NO");
		

	}

}
