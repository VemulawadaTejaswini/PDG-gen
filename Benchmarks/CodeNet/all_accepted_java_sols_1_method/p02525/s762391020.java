import java.util.Scanner;



public class Main{

public static void main(String[] args){

	int[] x;
	int n,sum,i;
	double ave,var;

	Scanner sc = new Scanner(System.in);	

	while(true){
		n=sc.nextInt();
		if(n==0){
			break;
		}
		x=new int[n];
		sum=0;
		var=0;
		for(i=0;i<x.length;i++){
			x[i]=sc.nextInt();
			sum+=x[i];
		}
		ave=(double)sum/(double)n;
		for(i=0;i<x.length;i++){
			var+=((double)x[i]-ave)*((double)x[i]-ave);
		}
		var/=(double)n;
		System.out.printf("%f\n",Math.sqrt(var));

	}



}

}