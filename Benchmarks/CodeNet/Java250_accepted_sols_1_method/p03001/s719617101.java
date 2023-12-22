import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	double w=sc.nextDouble();
	double h=sc.nextDouble();
	double x=sc.nextDouble();
	double y=sc.nextDouble();

	int te=0;
	double ans=w*h/2;
	if(w/2==x&&h/2==y){
		te=1;
	}
System.out.print(ans);
System.out.println(" "+te);
	}}