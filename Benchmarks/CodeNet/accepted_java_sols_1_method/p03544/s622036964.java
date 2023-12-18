import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
long n0=2;
long n1=1;
long n2=3;
int n=sc.nextInt();
if(n==0){
	System.out.println(2);
}else if(n==1){
	System.out.println(1);
}else{
for(int i=2;i<=n;i++){

	n2=n0+n1;
	n0=n1;
	n1=n2;

	}
System.out.println(n2);

	}}}