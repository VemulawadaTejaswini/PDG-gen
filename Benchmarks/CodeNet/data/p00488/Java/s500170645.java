
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);			
		int []  p = new int [5];
		int s=0;
		
		for(int i=0;i<5;i++){
			int x=sc.nextInt();
			p[i]=x;
		}
		
		for(int j=0;j<3;j++){
			for(int k=3;k<5;k++){
				if(j==0 && k==3) s=p[k]+p[j];
				if(s >p[k]+p[j]);
			}
		}
		
		System.out.printf("%d",s-50);
		sc.close();
		System.exit(0);
	}
}