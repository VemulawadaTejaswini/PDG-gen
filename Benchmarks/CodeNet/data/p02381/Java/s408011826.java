import java.util.Scanner;

class Main
{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	double[][] s = new double[100][1000];
	int[] n = new int[1000];
	int x = 0;
	double A;
	double sou;
	double[] m = new double[1000];
	
	while(scan.hasNext()){
		sou = 0;
		n[x] = scan.nextInt();
		if(n[x] == 0){
			break;}
		for(int i=0; i<n[x]; i++){
			s[x][i] = scan.nextDouble();
			sou += s[x][i];}
			m[x] = sou / n[x];
		x++;}
		
	for(int q=0; q<x; q++){
		A = 0;
		for(int i=0; i<n[q]; i++){
			A += (s[q][i] - m[q]) * (s[q][i] - m[q]) / n[q];}
			double a = Math.sqrt(A);
			System.out.printf("%.8f\n", a);}
	}
}
