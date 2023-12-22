import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++) {
	    	a[i]=scan.nextInt();
	    }
	    scan.close();
	    Arrays.sort(a);
	    int Acnt=0,Bcnt=0;
	    for(int i=n-1,j=0;i>=0;i--,j++) {
	    	if(j%2==0)Acnt+=a[i];
	    	else Bcnt+=a[i];
	    }
	    System.out.println(Acnt-Bcnt);
	}

}