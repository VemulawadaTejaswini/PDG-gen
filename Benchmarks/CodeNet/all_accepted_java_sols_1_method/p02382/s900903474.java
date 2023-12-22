import java.util.Scanner;

class Main
{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	double[] x = new double[100];
	double[] y = new double[100];
	double d;
	double D;
	double xy;
	double max = 0;
	
	int n = scan.nextInt();
	
	for(int i=0; i<n; i++){
		x[i] = scan.nextDouble();}
	for(int i=0; i<n; i++){
		y[i] = scan.nextDouble();}
		
	for(int p=1; p<=3; p++){
		D = 0;
		for(int i=0; i<n; i++){
			xy = 1;
			for(int t=1; t<=p; t++){
				xy *= Math.abs(x[i]-y[i]);}
			D += xy;}
			if(p == 1){
				d = D;}
			else if(p == 2){
				d = Math.sqrt(D);}
			else{
				d = Math.cbrt(D);}
			System.out.printf("%.6f\n", d);}
		for(int i=0; i<n; i++){
			xy = Math.abs(x[i]-y[i]);
			if(max < xy){
				max = xy;}}
		System.out.printf("%.6f\n", max);
	}
}
