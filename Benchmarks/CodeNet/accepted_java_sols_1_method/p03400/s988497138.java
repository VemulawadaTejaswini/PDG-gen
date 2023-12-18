import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int d = scan.nextInt();
	    int x = scan.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++) {
	    	a[i]=scan.nextInt();
	    }
	    scan.close();
	    int sum=0;
	    for(int i=0;i<n;i++) {
	    	for(int j=0;a[i]*j+1<=d;j++) {
		    	sum+=1;
		    }
	    }
	    System.out.println(sum+x);
	}

}
