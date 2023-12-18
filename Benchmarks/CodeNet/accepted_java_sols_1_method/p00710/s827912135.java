import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n, r, p, c;
	int[] num;
	int[] pc;
	while(true){
	    n = sc.nextInt();
	    r = sc.nextInt();
	    if(n==0 && r==0) break;
	    num = new int[n];
	    for(int i=0;i<n;i++) num[i] = n-i;
	    for(int i=0;i<r;i++){
		p = sc.nextInt();
		c = sc.nextInt();
		pc = new int[p-1];
		for(int j=0;j<p-1;j++) pc[j]  = num[j];
		for(int j=0;j<c;j++) num[j] = num[j+p-1];
		for(int j=0;j<p-1;j++) num[j+c] = pc[j];	 
	    }
	    System.out.println(num[0]);
	}
    }
}