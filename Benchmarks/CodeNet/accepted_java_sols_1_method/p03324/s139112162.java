import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int d=sc.nextInt();
	int n=sc.nextInt();
	if(d==0){
		d=1;
	}else if(d==1){
		d=100;
	}else{
		d=10000;
	}
	if(n==100){
		n++;
	}
	System.out.println(d*n);

	}}