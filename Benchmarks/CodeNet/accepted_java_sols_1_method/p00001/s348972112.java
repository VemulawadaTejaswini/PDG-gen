import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner scanf =new Scanner (System.in);
		
		int a []= new int[10];
		int x,i,k,j;
		
		for (i=0; i<10 ;i++)
		a[i]=scanf.nextInt();
		
		for (j=9; j>0 ;j--)
		for (k=0; k<j ;k++)
		if (a[k]>a[k+1]) {
			x=a[k]; a[k]=a[k+1]; a[k+1]=x;} 
		System.out.println(a[9]+"\n"+a[8]+"\n"+a[7]);
		
	}
}