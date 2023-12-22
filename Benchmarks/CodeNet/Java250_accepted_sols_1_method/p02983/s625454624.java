import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    long L =sc.nextLong();
	    long R = sc.nextLong();
	    int min = Integer.MAX_VALUE;

	    for(int i=0;i<2018;i++) {
	    	long num1 = L+i;
	    	if(num1>R)break;
	    	for(int j=i+1;j<2019;j++) {
		    	long num2 = L+j;
		    	if(num2>R)break;
		    	int a = (int)(((num1%2019)*(num2%2019))%2019);
		    	min = Math.min(a,min);
	    	}
	    }
	    System.out.println(min);
	}



}