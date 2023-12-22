import java.util.Scanner;

class Main
{
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	
	int[] x = new int[10000];
	int[] y = new int[10000];
	int i;
	int kari;
	
	for (i=0; i<=10000; i++){
		x[i] = scan.nextInt();
		y[i] = scan.nextInt();
		if (x[i]==0 && y[i]==0){
			break;}
		else if (x[i]>y[i]){
			kari = x[i];
			x[i] = y[i];
			y[i] = kari;}}
			
	for (int q=0; q<i; q++){
		System.out.println(x[q]+" "+y[q]);}
	}
}
