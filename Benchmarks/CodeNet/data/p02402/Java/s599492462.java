import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	int n,min=100,max=0,s=0;
	Scanner scan = new Scanner(System.in);
	n= scan.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=scan.nextInt();
		s=s+a[i];
		if(max<a[i])
			max=a[i];
		if(min>a[i])
			min=a[i];
		
	}
	System.out.println(min+" "+max+" "+s);
	
}
}