
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		 for(int i=0;i<3;i++)  
		    {  
		        for(int j=0;j<3;j++)  
		            a[i][j]=sc.nextInt();
		    } 
		 int sum1,sum2,sum3,sum4;  
		    sum1=a[0][0]+a[1][1]+a[2][2];  
		    sum2=a[0][1]+a[1][2]+a[2][0];  
		    sum3=a[1][0]+a[2][1]+a[0][2];  
		    if(sum1==sum2&&sum2==sum3)  
		       System.out.println("Yes"); 
		    else
               System.out.println("No");
	}

}
