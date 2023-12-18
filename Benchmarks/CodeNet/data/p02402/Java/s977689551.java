import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	int[] a=new int[n];
        a[0]=scan.nextInt();
????????????int min=a[0],max=a[0],s=a[0];
	for(int i=1;i<n;i++) {
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