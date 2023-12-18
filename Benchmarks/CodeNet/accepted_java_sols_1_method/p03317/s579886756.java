import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	int[] a;
	a=new int[100000];
	int k,n,x,t;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	k=sc.nextInt();
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	x=(n-1)/(k-1);
	t=(n-1)%(k-1);
	if(t>0)
		x++;
	System.out.println(x);
	}

}
