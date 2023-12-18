import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int h1=0,h2=0,h3=0,h4=0,h5=0,h6=0;
		for(int i=0;i<n;i++){
			double h=sc.nextDouble();
			if(h<165.0)h1++;
			else if(165.0<=h&&h<170.0)h2++;
			else if(170.0<=h&&h<175.0)h3++;
			else if(175.0<=h&&h<180.0)h4++;
			else if(180.0<=h&&h<185.0)h5++;
			else h6++;
		}
		System.out.print("1:");
		for(int j=1;j<=h1;j++){
			System.out.print("*");
		}
		System.out.println();
		System.out.print("2:");
		for(int j=1;j<=h2;j++){
			System.out.print("*");
		}
		System.out.println();
		System.out.print("3:");
		for(int j=1;j<=h3;j++){
			System.out.print("*");
		}
		System.out.println();
		System.out.print("4:");
		for(int j=1;j<=h4;j++){
			System.out.print("*");
		}
		System.out.println();
		System.out.print("5:");
		for(int j=1;j<=h5;j++){
			System.out.print("*");
		}
		System.out.println();
		System.out.print("6:");
		for(int j=1;j<=h6;j++){
			System.out.print("*");
		}	
		System.out.println();
	}
}