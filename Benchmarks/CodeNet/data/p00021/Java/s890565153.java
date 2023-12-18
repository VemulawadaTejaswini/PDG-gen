import java.util.*;
 
class Main {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
		int i,k;
		int N =sc.nextInt();
		double [][]a=new double [N][8];
		
		for (i=0;i<N;i++)
			for (k=0;k<8;k++)
				a[i][k]=sc.nextDouble();
		
		for (i=0;i<N;i++)
			if((a[i][3]-a[i][1])*(a[i][6]-a[i][4])==(a[i][2]-a[i][0])*(a[i][7]-a[i][5]))
			System.out.println("YES");
			else System.out.println("NO");
		
		

    }
}