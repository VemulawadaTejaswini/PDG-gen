import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int count5=0;
		int count7=0;
		
		for(int i=0;i<3;i++) {
			int j=0;
			j=sc.nextInt();
			if(j==5)	count5+=1;
			if(j==7)	count7+=1;
		}
		
		if(count5==2&&count7==1) 
			System.out.println("YES");
		else
			System.out.println("NO");
		
		sc.close();
	}
}