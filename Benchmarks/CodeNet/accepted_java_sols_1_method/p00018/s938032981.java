import java.util.*;
 
class Main {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
		int [] a= new int[5];
		int i,k,j;
		
		for(i=0;i<5;i++)
		a[i]=sc.nextInt();
		
		for(i=4;i>0;i--)
			for(k=0;k<i;k++)
				if(a[k]<a[k+1]) {j=a[k]; a[k]=a[k+1]; a[k+1]=j;}
		
		for(i=0;i<4;i++)
		System.out.print(a[i]+" ");
		
		System.out.println(a[4]);
		

    }
}